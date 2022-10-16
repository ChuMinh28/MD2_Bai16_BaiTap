package baitap2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            String line;
            String PATH_FILE = "D:\\MD2\\Bai_16\\Bai16_BaiTap\\src\\baitap2\\countries.csv";
            bufferedReader = new BufferedReader(new FileReader(PATH_FILE));

            while ((line=bufferedReader.readLine())!=null){
                printCountry(parseCsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            {
                try {
                    if (bufferedReader!=null){
                        bufferedReader.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static List<String> parseCsvLine(String csvLone){
        List<String> result = new ArrayList<>();
        if (csvLone!=null){
            String[] splitData = csvLone.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public static void printCountry(List<String> country){
        System.out.println(
                "Country [id = "
                +country.get(0)
                +", code = "+country.get(1)
                +", name = "+country.get(2)
                +"]"
        );
    }
}
