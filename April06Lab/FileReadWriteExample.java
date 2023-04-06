package April06Lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadWriteExample {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 1 to store data or 2 to print data:");
            int option = Integer.parseInt(br.readLine());
            
            switch(option) {
                case 1:
                    System.out.println("Enter data to store in file:");
                    String data = br.readLine();
                    BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\abcd.txt"));
                    bw.write(data);
                    bw.close();
                    System.out.println("Data written to file successfully.");
                    break;
                    
                case 2:
                    BufferedReader fileReader = new BufferedReader(new FileReader("D:\\abcd.txt"));
                    String line = null;
                    while ((line = fileReader.readLine()) != null) {
                        System.out.println(line);
                    }
                    fileReader.close();
                    break;
                    
                default:
                    System.out.println("Invalid option selected.");
            }            
        } catch (IOException e) {
            System.out.println("An error occurred while reading/writing file.");
            e.printStackTrace();
        }}}
            
           