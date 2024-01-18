import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int panjang=input.nextInt();
        int lebar=input.nextInt();
        int tinggi=input.nextInt();
        int volume=panjang*lebar*tinggi;
        int luasP=2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.println(luasP);
        System.out.println(volume);
        /*
        * Operator perbandingan akan menghasilkan true atau false
        * membandingkan 2 atau lebih nili
        * == -> Equals
        * != -> Not equals
        * > -> Greater Than or equals
        * < -> Lessthan or equals
         */
        boolean isTrue=5==5;
        boolean g=5!=6;
        System.out.println(isTrue);
        System.out.printf("hasil adalah %s\n", g);
        /*
        *Kesimpulan && = selagi keduanya true maka hasilnya akan true
        * Kesimpulan || = selagi salah satu ada yang true maka hasilnnya true
        * // Operator Comparison + opertor Logical = akan di eksekusi
        * terlebijh dahulu yang and, setelah itu akan di eksekusi yang or.
         */


    }
}
