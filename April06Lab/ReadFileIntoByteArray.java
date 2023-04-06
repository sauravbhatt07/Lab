package April06Lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class ReadFileIntoByteArray {
    public static void main(String[] args) {
        String fileName = "D:\\A.txt"; // replace with your file name
        try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            byte[] byteArray = new byte[(int)file.length()];
            fis.read(byteArray);
            fis.close();
            System.out.println("Contents of " + fileName + " into byte array:");
            for(int i=0; i<byteArray.length; i++) {
                System.out.print(byteArray[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }}}
            