package io.modmanager.minecraft;

import javax.swing.SwingUtilities;

import io.modmanager.minecraft.view.MainWindowView;

public final class MainApplication {

    private static MainWindowView window;

    public static void main(String[] args) {

        window = new MainWindowView("ModManager");

        SwingUtilities.invokeLater(() -> {

            window.setVisible(true);

        });

    }

}
