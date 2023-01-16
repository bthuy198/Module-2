package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class Test {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(3, "Iphone 12", 5000));
        list.add(new Product(4, "Samsung Z Fold", 10000));
//        writeFileUsePrintWriter(list);
        String toSplit = "50,Zoombie,teeth,hands";
        String[] result = toSplit.split(",");
        for(String token : result){
            System.out.println(token);
        }
    }

    // ghi file sử dụng printWriter
    public static <T> void writeFileUsePrintWriter(List<T> list){
        try{
            String url = "src/demo/product.txt";
            File file = new File(url);

            PrintWriter printWriter = new PrintWriter(file);
            for(int i = 0; i < list.size(); i++){
                printWriter.write(list.get(i).toString() + "\n");
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    // đọc file sử dụng file reader bộ đệm char[] cbuff
    public static void readFileUseCBuff() {
        try {
            FileReader fileReader = new FileReader("src/demo/product.txt");
            String str = "";
            char[] cBuff = new char[5];
            int count = -1;
            while ((count = fileReader.read(cBuff)) != -1) {
                for (int i = 0; i < count; i++) {
                    str += cBuff[i];
                }
            }
            System.out.println(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // đọc file sư dụng file reader
    public static void readFileUseFileReader() {
        try {
            Reader fileReader = new FileReader("src/demo/product.txt");
            String str = "";
            int ch = -1;
            while ((ch = fileReader.read()) != -1) {
                str += (char) ch;
            }
            System.out.println(str);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
