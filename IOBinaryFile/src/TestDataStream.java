import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        try ( // Create an output stream for file
              DataOutputStream output = new DataOutputStream(new FileOutputStream("src/data/temp.txt"));
        ) {
            // Write student test scores to the file
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try ( // Create an input stream for file temp.dat
//              DataInputStream input = new DataInputStream(new FileInputStream("src/data/temp.txt"));
//              ){
//            // Read student test scores from the file
//            System.out.println(input.readUTF() + " " + input.readDouble());
//            System.out.println(input.readUTF() + " " + input.readDouble());
//            System.out.println(input.readUTF() + " " + input.readDouble());
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
