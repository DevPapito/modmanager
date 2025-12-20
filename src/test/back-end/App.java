import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;
import java.nio.file.StandardCopyOption;

import java.io.IOException;

import java.util.List;

class App {

    public static void main(String[] args) throws IOException {

        // Construir os metodos de visualização com construtores Path

        System.out.println(EngineOS.winDocuments);
        System.out.println(EngineOS.linuxDocuments);
        System.out.println(EngineOS.linuxBrDocuments);
        System.out.println(EngineOS.minecraftMods);
        System.out.println(EngineOS.winModManager);
        System.out.println(EngineOS.linuxModManager);
        System.out.println(EngineOS.linuxBrModManager);
        System.out.println(EngineOS.winModManagerRepository);
        System.out.println(EngineOS.linuxModManagerRepository);
        System.out.println(EngineOS.linuxBrModManagerRepository);
        System.out.println(EngineOS.existsDirModManager('w'));
        System.out.println(EngineOS.existsDirModManagerRepository('w'));
        System.out.println(EngineOS.existsMinecraft(EngineOS.minecraft));
        System.out.println(EngineOS.existsMinecraftMods(EngineOS.minecraftMods));

        // O File.newDirectoryStream ja realize um target direto, somente necessario criar um caminho para destino
        // Metodo de criação nos arquivos
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(EngineOS.winModManagerRepository,"*.jar")) {

            EngineOS.copyMods(stream);

        }

        // funcao clear do botao
        // implementação do metodo removeAll
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(EngineOS.minecraftMods,"*.jar")) {

            EngineOS.removeAll(stream);

        }


    }

}
