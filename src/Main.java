import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy,kilo,kitleEndeksi;

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (m) Cinsinden Giriniz:");
        boy=input.nextDouble();

        System.out.print("Lütfen Kilonuzu Griniz:");
        kilo=input.nextDouble();

        kitleEndeksi=kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz: "+kitleEndeksi);

    }
}