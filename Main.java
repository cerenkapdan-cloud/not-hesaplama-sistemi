package NotHesaplamaSistemi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vize notu: ");
        double vizeNotu = sc.nextDouble();
        System.out.print("Final notu: ");
        double finalNotu = sc.nextDouble();
        System.out.println("Ödev notu: ");
        double ödevNotu = sc.nextDouble();
        double ortalama = ödevNotu * 0.125 + vizeNotu * 0.375 + finalNotu * 0.50;
        System.out.println("Ortalama: " + ortalama);
        if (ortalama >= 90) {
            System.out.println("harf notu: AA");
        }else if (ortalama >= 80) {
            System.out.println("harf notu: BB");
        }else if (ortalama >= 70) {
                System.out.println("harf notu: CC");
            }else if (ortalama >= 60) {
                System.out.println("harf notu: DD");
            }else if (ortalama >= 50) {
                System.out.println("harf notu: FD");
            }else {
                System.out.println("harf notu: FF");
            }
    }
}
