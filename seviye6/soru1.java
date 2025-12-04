package seviye6;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class soru1 {
    public static void main(String[] args) {
        /* Programın bulunduğu klasördeki herhangi bir “metin belgesi”nin içeriğini 
ekrana yazdıran programı yazınız */
        File dos = new File("c:\\Users\\Gencay\\Desktop\\odevjava\\seviye6");
        File[] listOfFiles = dos.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        File file = null;
        if (listOfFiles != null && listOfFiles.length > 0) {
            file = listOfFiles[0]; // İlk bulunan metin belgesini al
            System.out.println(file);
            try {
                List<String> lines = Files.readAllLines(Paths.get(file.getAbsolutePath()));
                for (String line : lines) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Klasörde herhangi bir metin belgesi bulunamadı.");
        }
    }
}
