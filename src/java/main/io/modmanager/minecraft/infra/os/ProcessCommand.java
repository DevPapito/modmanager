package io.modmanager.minecraft.infra.os;

import java.io.IOException;
import java.io.File;

import java.awt.Desktop;

public class ProcessCommand {

    public boolean openFolder(String path) {

        try{

            Desktop.getDesktop().open(new File(path));

            return true;

        }catch(IOException e) {

            e.printStackTrace();

        }catch(Exception e) {e.printStackTrace();}

        return false;

    }

}
