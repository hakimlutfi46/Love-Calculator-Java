import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int rand_int = rand.nextInt(100);

        println("===============================");
        println("Love Calculator");
        println("===============================");

        print("Masukkan nama kamu = ");
        String nama = sc.nextLine();

        print("Masukkan nama pasangan kamu = ");
        String pasangan = sc.nextLine();

        println("Cinta " + nama + " dengan " + pasangan + " adalah " + rand_int + "%");

    }

    static void print(String cetak) {
        System.out.print(cetak);
    }

    static void println(String cetak) {
        System.out.println(cetak);
    }
}
