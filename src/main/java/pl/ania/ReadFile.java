package pl.ania;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ReadFile {

    private static String sourcePath = "C:\\Users\\lukasz\\Desktop\\Ania\\testSelenium.txt";
    private static String destPath = "C:\\Users\\lukasz\\Desktop\\Ania\\files\\testSelenium.txt";


    private static void copyFile(File source, File dest) throws IOException {
        FileUtils.copyFile(source, dest);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        File source = new File(sourcePath);
        File dest = new File(destPath);
        File directory = new File("C:\\Users\\lukasz\\Desktop\\Ania\\files");


        while (true){
            if (directory.list().length == 0) {
                System.out.println("import pliku");
            }
            if (source.exists()) {
                copyFile(source, dest);
                source.delete();
                System.out.println("skasowano plik");

            }
            Thread.sleep(2000);
            if (directory.list().length > 0){
                System.out.println("katalog nie jest pusty");
                System.out.println("test zawartości pliku");
                FileUtils.cleanDirectory(directory);
            }
        }
    }
}

