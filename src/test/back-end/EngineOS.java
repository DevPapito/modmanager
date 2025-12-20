import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;
import java.nio.file.StandardCopyOption;

import java.io.IOException;

class EngineOS {

    public static final String SEPARATOR = System.getProperty("file.separator");

    // Documents

    public static Path winDocuments = Path.of(System.getProperty("user.home")+
            EngineOS.SEPARATOR+"Documents");

    public static Path modLoader;

    public static Path linuxDocuments = Path.of("~/Document");

    public static Path linuxBrDocuments = Path.of("~/Documentos");

    // mods minecraft

    public static Path minecraftMods = Path.of(System.getenv("APPDATA")+EngineOS.SEPARATOR+".minecraft"+EngineOS.SEPARATOR+"mods");

    public static Path minecraft = Path.of(System.getenv("APPDATA")+EngineOS.SEPARATOR+".minecraft");

    // ModManager

    public static Path linuxModManager = Path.of(linuxDocuments+EngineOS.SEPARATOR+"modManager");

    public static Path linuxBrModManager = Path.of(linuxBrDocuments+EngineOS.SEPARATOR+"modManager");

    // modManagerRepository

    public static Path linuxModManagerRepository = Path.of(linuxDocuments+EngineOS.SEPARATOR+"modManager"+EngineOS.SEPARATOR+"mods");

    public static Path linuxBrModManagerRepository = Path.of(linuxBrDocuments+EngineOS.SEPARATOR+"modManager"+EngineOS.SEPARATOR+"mods");

    public static Path winModManager = Path.of(winDocuments+EngineOS.SEPARATOR+"modManager");

    public static Path winModManagerRepository = Path.of(winModManager+EngineOS.SEPARATOR+"repository");

    // verifys

    public static boolean existsDir(Path dir) {

        return Files.exists(dir) ? true : false;

    }

    public static boolean existsDirModManager(char logo) {

        if (logo == 'w') return existsDir(winModManager);

        return existsDir(linuxModManager);

    }

    public static boolean existsDirModManagerRepository(char logo) {

        if (logo == 'w') return existsDir(winModManagerRepository);

        return existsDir(linuxModManagerRepository);

    }

    public static boolean existsMinecraft(Path path) {

        return existsDir(path);

    }

    public static boolean existsMinecraftMods(Path path) {

        return existsMinecraft(path);

    }

    public static Path buildPath(String path) {

        return Path.of(path);

    }

    public static void removeAll(DirectoryStream<Path> stream) throws IOException {

        for (Path path : stream) {

            Path destiny = buildPathDestiny(path.getFileName());

            Files.delete(destiny);

        }

    }


    public static void copyMods(DirectoryStream<Path> stream) throws IOException {

        for (Path path : stream) {

            Path destiny = buildPathDestiny(path.getFileName());

            // Não é o formato mais otimizado
            Files.copy(path, destiny, StandardCopyOption.REPLACE_EXISTING);

        }

    }

    public static Path buildPathDestiny(Path path) throws IOException {

        return Path.of(EngineOS.minecraftMods+EngineOS.SEPARATOR+path);

    }

    public static DirectoryStream<Path> readRepository(Path repository) throws IOException {

        return Files.newDirectoryStream(repository);

    }

}
