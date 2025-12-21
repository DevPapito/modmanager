package io.modmanager.minecraft.service;

import io.modmanager.minecraft.infra.os.ProcessCommand;

import java.io.IOException;

public class MainWindowService {

    private ProcessCommand pros = new ProcessCommand();

    public boolean openMods() {

        return this.open(System.getenv("APPDATA")+"\\"+".minecraft"+"\\"+"mods");

    }

    public boolean openRepository() {

        return this.open(System.getProperty("user.home")+"\\"+"Documents"+"\\"+"modManager"+"\\"+"repository");

    }

    private boolean open(String path) {

        pros.openFolder(path);

        return true;

    }

}
