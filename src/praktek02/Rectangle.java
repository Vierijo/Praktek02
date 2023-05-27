package praktek02;
public class Rectangle {
    double Panjang;
    double Lebar;

    public Rectangle() {
        Panjang = 5;
        Lebar = 2;
    }
    
    void cetakInfo(){
        System.out.println("=========================");
        System.out.println("Panjang :" + Panjang);
        System.out.println("Lebar :" + Lebar);
        System.out.println("=========================");
    }
    
    double hitungLuas(){
        double Luas;
        Luas = Panjang * Lebar;
        
        return Luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah = " + hitungLuas());
    }
}
