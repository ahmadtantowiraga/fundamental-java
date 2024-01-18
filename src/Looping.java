import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
//    for (int i=1; i < 100; i++){
//        if (i%2==0){
//            System.out.println(i + " Adalah bilangan genap");
//        }else{
//            System.out.println(i + " Adalah bilangan ganjil");
//        }
//
//    }
        Scanner input=new Scanner(System.in);
//        int jumlahDeret=input.nextInt();
//        for (int i=1; i <= jumlahDeret;i++ ){
//            if (i%2==0){
//                if (i==50 || i==70){
//                    continue;
//                }
//                System.out.println(i);
//            }
//        }
//        int i=1;
//        while (i<=jumlahDeret){
//            if (i%2==0){
//                if (i==50 || i==70){
//                    i++;
//                    continue;
//                }
//                System.out.println(i);
//            }
//            i++;
//        }
        String nama=" ";
        do{
            System.out.println("Masukan nama : ");
            nama=input.nextLine();
        }while(nama.length()<8);
        System.out.println(nama);

//        String nama=null;
//        Integer umur=null;
//        String alamat=null;
//        do {
//            System.out.println("Masukan nama :");
//            nama=input.nextLine();
//            System.out.println("Masukan umur :");
//
//            umur=input.nextInt();
//            System.out.println("Masukan alamat :");
//            input.nextLine();
//            alamat=input.nextLine();
//        }while(((nama.length() < 6 || nama.length() > 16) || umur < 18)|| alamat.length()>20);
//        System.out.println("Nama = " + nama);
//        System.out.println("Umur ="+ umur);
//        System.out.println("Alamat ="+ alamat);
        }
    }

