import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/data/numbers.txt");
        int maxValue = readAndWriteFile.findMaxValue(numbers);
        readAndWriteFile.writeFile("src/data/result.txt",maxValue);
    }
    public List<Integer> readFile(String url){
        List<Integer> numbers = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(url));
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return numbers;
    }
    public void writeFile(String url, int result){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(url));
            bufferedWriter.write("Max value in array is " + result);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public int findMaxValue(List<Integer> numbers){
        int max = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }
}
