import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int x, y, z;

        Scanner utp = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz.");
        x = utp.nextInt();
        System.out.print("Ikinci sayiyi giriniz.");
        y = utp.nextInt();
        System.out.print("Ucuncu sayiyi giriniz.");
        z = utp.nextInt();

        if ((x > y) && (x > z)){
            if (y > z){
                System.out.print("Siralama"+ x +">"+ y+">" + z);
            }
            else {
                System.out.print("Siralama"+ x +">"+ z+">" + y);
            }
        } else if ((y > x) && (y > z)) {
            if (x > z){
                System.out.print("Siralama"+ y +">"+ x+">" + z);
            }
            else {
                System.out.print("Siralama"+ y +">"+z +">" + x);
            }
        } else if ((z > x) && (z > y)) {
            if (y > x){
                System.out.print("Siralama"+ z +">"+ y+">" + x);
            }
            else {
                System.out.print("Siralama"+ z +">"+ x+">" + y);
            }
        }
    }
}
