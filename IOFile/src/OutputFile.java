import java.io.*;

public class OutputFile {
    public static void main(String[] args) throws IOException {
        String[] data = {
                "Hello Java!",
                "Good bye!"
        };
        File file = new File("src/content.txt");
        OutputStream outputStream = new FileOutputStream(file, true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        for(String line : data){
            outputStreamWriter.write(line);
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();

        outputStream.close();
        outputStreamWriter.close();
    }
}
