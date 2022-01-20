import java.util.Scanner;

public class HipotenusHesap {
    public static void main(String[] args) {
        double kisaKenar, uzunKenar, hipotenus, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Kısa Kenar : " );
        kisaKenar = input.nextDouble();

        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun Kenar : " ) ;
        uzunKenar = inp.nextDouble();

        hipotenus = Math.sqrt((kisaKenar * kisaKenar) + (uzunKenar * uzunKenar));

        System.out.println("Hipotenüs : " + hipotenus);

        cevre = kisaKenar + uzunKenar + hipotenus;
        System.out.println("Çevre : " + cevre);
         double u;
         u = cevre / 2 ;
         alan = Math.sqrt( u * (u - kisaKenar) * (u-uzunKenar)*(u-hipotenus));
        System.out.println("Alan : " + alan);


    }
}
