package io.modmanager.minecraft.infra.os;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;
import java.nio.file.StandardCopyOption;

import java.io.IOException;

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

    public boolean exitsMinecraftMods() { return existsPath(pathMinecraftMods);}

    public boolean existsModManager() { return existsPath(pathModManager);}

    public boolean existsModManagerRepository() { return existsPath(pathModManagerRepository);}

    public void removeAllMods(Path pathDirectory, String glob) {

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory,glob)) {


            for (Path path : stream) {

                Path destiny = buildPathDestiny(path.getFileName());

                Files.delete(destiny);

            }

        }catch(IOException e){}

    }

    public void copyMods(Path pathDirectory, String glob) {

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory,glob)) {

            for (Path path : stream) {

                Path destiny = buildPathDestiny(path.getFileName());

                Files.copy(path, destiny, StandardCopyOption.REPLACE_EXISTING);

            }

        }catch(IOException e){}

    }

    private static Path buildPathDestiny(Path path) {

        return pathMinecraftMods.resolve(EngineOS.SEPARATOR+path);

    }


}
