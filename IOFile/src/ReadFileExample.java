import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        String url = "src/data/numbers.txt";
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(url));
            String line = "";
            int sum = 0;
            while((line = bufferedReader.readLine()) != null){
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
