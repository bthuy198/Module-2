import java.io.*;

public class CopyBinaryFile {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/data/binary.pdf");
            FileOutputStream fileOutputStream = new FileOutputStream("src/data/clonePDF.txt");
            int bRead = -1;
            while((bRead = fileInputStream.read()) != -1){
                fileOutputStream.write(bRead);
            }
            System.out.println("Copy completely");
            fileOutputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
