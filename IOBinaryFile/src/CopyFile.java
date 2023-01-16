import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest){

    }

    public static void main(String[] args) {
        String urlSourceFile = "src/data/sourceFile.txt";
        String urlDestFile = "src/data/destFile.txt";
        File sourceFile = new File(urlSourceFile);
        File destFile = new File(urlDestFile);
        try{
            copyFileUsingJava7Files(sourceFile,destFile);
            System.out.println("Copy completed");
        } catch (IOException e) {
            System.err.println("Can't copy file");
            System.out.println(e.getMessage());
        }
    }
}
