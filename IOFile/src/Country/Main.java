package Country;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "src/data/country.txt";
        BufferedReader br;
        List<Country> countries = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader(url));
            String[] info = new String[3];
            String line = "";
            while((line = br.readLine()) != null){
                info = line.split(",");
                Country country = new Country();
                country.setId(Integer.parseInt(info[0]));
                country.setCode(info[1]);
                country.setName(info[2]);
                countries.add(country);
            }
            for(Country country : countries){
                System.out.println(country.toString());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
