package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteFile {
   static File file = new File("D:\\MD2\\Bai_16\\Bai16_BaiTap\\src\\test\\write.txt");

    public static void main(String[] args) {
        try {
            Formatter formatter = new Formatter(file);
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            formatter.format(name);
            formatter.close();
        }catch (FileNotFoundException e){
            System.err.println("Error");
        }
    }
}
