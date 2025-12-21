package io.modmanager.minecraft.controller;

import io.modmanager.minecraft.view.MainWindowView;

import io.modmanager.minecraft.service.MainWindowService;

import javax.swing.JProgressBar;
import javax.swing.JOptionPane;

public class MainWindowController {

    private MainWindowView window;

    private MainWindowService service;

    public MainWindowController() {

        service = new MainWindowService();

    }

    public void testSincre() {

        window.getBarLoading().setValue(50);

    }

    public boolean startMinecraftModsFolder() {

        boolean verify = service.openMods();

        if (!verify) return false;

        return true;

    }

    public boolean startRepositoryFolder() {

        boolean verify = service.openRepository();

        if (!verify) return false;

        return true;

    }

    public void inicializer() {

        if (!service.existsMinecraft()) {

            System.out.println('\u0007');
            JOptionPane.showMessageDialog(null,"Não foi encontrado a pasta raiz do minecraft em %APPDATA%. Impossível iniciar o programa.","Erro minecraft",JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }

        if (!service.existsMinecraftMods()) {

            System.out.println('\u0007');
            JOptionPane.showMessageDialog(null,"Não foi encontrado a pasta \"mods\" em .minecraft. Impossível iniciar o programa.","Erro pasta mods",JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }

        if (!service.existsModManager()) {

            service.makeModManagerStructure();
            window.getLabelShowPathMods().setText(service.getPathMinecraftMods());
            window.getLabelShowPathRepository().setText(service.getPathModManagerRepository());

        }

        if (!service.existsModManagerRepository()) {

            System.out.println('\u0007');
            JOptionPane.showMessageDialog(null,"A pasta \"repository\" foi criada novamente com sucesso!","Informação",JOptionPane.INFORMATION_MESSAGE);
            service.makeRepository();

        }


    }

    public MainWindowView getMainWindowView() {

        return window;

    }

    public void setMainWindowView(MainWindowView window) {

        this.window = window;

    }

}
