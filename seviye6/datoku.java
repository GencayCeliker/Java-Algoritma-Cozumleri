package seviye6;
import java.io.IOException;
import java.io.RandomAccessFile;
public class datoku {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("records.dat", "r");
            
            while (file.getFilePointer() < file.length()) {
                System.out.println(file.readUTF());  // UTF ile kaydedildiği için bu şekilde okunmalı
            }
            
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
