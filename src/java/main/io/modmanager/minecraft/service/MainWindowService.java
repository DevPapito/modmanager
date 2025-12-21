package io.modmanager.minecraft.service;

import io.modmanager.minecraft.infra.os.ProcessCommand;
import io.modmanager.minecraft.infra.os.EngineOS;

public class MainWindowService {

    private ProcessCommand pros = new ProcessCommand();

    public boolean openMods() {

        return this.open(String.valueOf(EngineOS.pathMinecraftMods.toString()));

    }

    public boolean openRepository() {

        return this.open(EngineOS.pathModManagerRepository.toString());

    }

    private boolean open(String path) {

        pros.openFolder(path);

        return true;

    }

}
