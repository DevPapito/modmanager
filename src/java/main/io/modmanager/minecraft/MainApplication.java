package io.modmanager.minecraft;

import io.modmanager.minecraft.controller.MainWindowController;

import javax.swing.SwingUtilities;

import io.modmanager.minecraft.view.MainWindowView;

public final class MainApplication {

    private static MainWindowView window;
    private static MainWindowController controller;

    public static void main(String[] args) {

        controller = new MainWindowController();

        window = new MainWindowView("Mod Manger",controller);
        controller.setMainWindowView(window);

        SwingUtilities.invokeLater(() -> {

            window.setVisible(true);
            window.connect();

        });

    }

}
