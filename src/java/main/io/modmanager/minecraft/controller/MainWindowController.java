package io.modmanager.minecraft.controller;

import io.modmanager.minecraft.view.MainWindowView;

import io.modmanager.minecraft.service.MainWindowService;

import javax.swing.JProgressBar;

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

    public MainWindowView getMainWindowView() {

        return window;

    }

    public void setMainWindowView(MainWindowView window) {

        this.window = window;

    }

}
