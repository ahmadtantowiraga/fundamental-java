import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        System.out.println("masukan data");
//        int masukanData=input.nextInt();
//        System.out.println("masukan data " + masukanData);
        System.out.println("Masukan Umur :");
        int umur=input.nextInt();
        System.out.println("Masukan Pnajang :");
        String panjang=input.next();

        System.out.println(umur +" "+ panjang);
        String fullName=input.nextLine();
        Scanner input2= new Scanner(System.in);
        System.out.println("Masukan Alamat : ");
        String alamat=input2.nextLine();

        System.out.println("\n\nBiodata :");
        System.out.println("Nama Lengkap : " + fullName);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
        //
        //print format
        /*
        * %s -> string
        * %d -> bilangan bulat
        * %f -> pecaan
         */

    }
}
