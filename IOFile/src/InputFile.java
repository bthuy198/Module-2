import java.io.*;
import java.nio.ReadOnlyBufferException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputFile {
    public static void main(String[] args) throws IOException {
        String url = "src/content.txt";
        FileInputStream fileInputStream = new FileInputStream(url);
        //sử dụng scanner để đọc file
//        Scanner scn = new Scanner(fileInputStream);
//
//        try{
//            while(scn.hasNextLine()){
//                System.out.println(scn.nextLine());
//            }
//        } finally {
//            try{
//                scn.close();
//                fileInputStream.close();
//            } catch (IOException e){
//                Logger.getLogger(ReadOnlyBufferException.class.getName()).log(Level.SEVERE,null,e);
//            }
//        }
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(ReadOnlyBufferException.class.getName()).log(Level.SEVERE,null,ex);
        } catch (IOException ex){
            Logger.getLogger(ReadOnlyBufferException.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            try{
                bufferedReader.close();
                fileInputStream.close();
            } catch (IOException ex){
                Logger.getLogger(ReadOnlyBufferException.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }

}

