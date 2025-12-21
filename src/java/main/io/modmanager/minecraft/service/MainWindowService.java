package io.modmanager.minecraft.service;

import io.modmanager.minecraft.infra.os.ProcessCommand;
import io.modmanager.minecraft.infra.os.EngineOS;

public class MainWindowService {

    private ProcessCommand pros = new ProcessCommand();
    private EngineOS engine = new EngineOS();

    public boolean openMods() {

        return this.open(String.valueOf(EngineOS.pathMinecraftMods.toString()));

    }

    public boolean openRepository() {

        return this.open(EngineOS.pathModManagerRepository.toString());

    }

    public boolean existsMinecraft() {

        return engine.existsMinecraft();
    }

    public boolean existsMinecraftMods() {

        return engine.existsMinecraftMods();

    }

    public boolean existsModManager() {

        return engine.existsModManager();

    }

    public boolean existsModManagerRepository() {

        return engine.existsModManagerRepository();

    }

    public void makeModManagerStructure() {

        engine.createModManager();
        engine.createRepository();

    }

    public void makeRepository() {

        engine.createRepository();

    }

    public String getPathMinecraftMods() {

        return engine.pathMinecraftMods.toString();

    }

    public String getPathModManagerRepository() {

        return engine.pathModManagerRepository.toString();

    }

    private boolean open(String path) {

        pros.openFolder(path);

        return true;

    }

}
