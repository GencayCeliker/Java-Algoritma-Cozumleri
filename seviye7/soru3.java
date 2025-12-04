package seviye7;

public class soru3 {
    // x3+y3 = z4 denklemini çözen, ve, x sayısı 60dan büyük 80den küçük, y 
//sayısı 100den büyük 110dan küçük, z sayısı 30dan büyük 40dan küçük şartlarını 
//sağlayan x,y,z tamsayısını bulunuz.
    public static void main(String[] args) {
        for (int x = 61; x < 80; x++)
            for (int y = 101; y < 110; y++)
                for (int z = 31; z < 40; z++)
                    if (x * x * x + y * y * y == z * z * z * z) {
                        System.out.println("x=" + x + " y=" + y + " z=" + z);
                        return;
                    }
    }
}
