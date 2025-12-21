package io.modmanager.minecraft.infra.os;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;
import java.nio.file.StandardCopyOption;

import java.io.IOException;

import javax.swing.JProgressBar;

public class EngineOS {

    public static final String SEPARATOR = System.getProperty("file.separator");

    public static Path pathWinDocuments = Path.of(System.getProperty("user.home")+
            EngineOS.SEPARATOR+"Documents");


    public static Path pathMinecraft = Path.of(System.getenv("APPDATA")+EngineOS.SEPARATOR+".minecraft");

    public static Path pathMinecraftMods = Path.of(pathMinecraft+EngineOS.SEPARATOR+"mods");

    public static Path pathModManager = Path.of(pathWinDocuments+EngineOS.SEPARATOR+"modManager");

    public static Path pathModManagerRepository = Path.of(pathModManager+EngineOS.SEPARATOR+"repository");


    public boolean existsPath(Path path) { return Files.exists(path);}

    public boolean existsMinecraft() { return existsPath(pathMinecraft); }

    public boolean existsMinecraftMods() { return existsPath(pathMinecraftMods);}

    public boolean existsModManager() { return existsPath(pathModManager);}

    public boolean existsModManagerRepository() { return existsPath(pathModManagerRepository);}

    public void createModManager() {

        try{
            Files.createDirectory(pathModManager);
        }catch(IOException e){}


    }

    public void createRepository() {

        try{
            Files.createDirectory(pathModManagerRepository);
        }catch(IOException e){}

    }

    public void removeAllMods(Path pathDirectory, String glob,JProgressBar bar) {

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory,glob)) {

            for (Path path : stream) {

                Path destiny = buildPathDestiny(path.getFileName());

                Files.delete(destiny);

                bar.setValue(bar.getValue()+1);

            }

            bar.setValue(100);

        }catch(IOException e){}

    }

    public boolean copyMods(Path pathDirectory, String glob,JProgressBar bar) {

        int rounds = 0;
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory,glob)) {

            for (Path path : stream) {

                Path destiny = buildPathDestiny(path.getFileName());
                System.out.println(path);
                System.out.println(destiny);

                Files.copy(path, destiny, StandardCopyOption.REPLACE_EXISTING);

                bar.setValue(bar.getValue()+1);

                rounds++;

            }

            if (rounds == 0) return false;

            bar.setValue(100);

        }catch(IOException e){}

        return true;

    }

    private static Path buildPathDestiny(Path path) {

        return Path.of(pathMinecraftMods+EngineOS.SEPARATOR+path);

    }


}
