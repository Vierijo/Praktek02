package praktek02;
public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        
        r1.Panjang = 9;
        r1.Lebar = 3;
        
        r1.cetakInfo();
        
        System.out.println("Luas Rectangle = " + r1.hitungLuas());
        
        r1.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakInfo();
        
    }
}
