import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("src/data/sourceFile.txt");
            fos = new FileOutputStream("src/data/clone.txt");

            int line;
            while((line = fis.read()) != -1){
                fos.write(line);
            }
            System.out.println("Copy successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fis.close();
            fos.close();
        }
    }
}
