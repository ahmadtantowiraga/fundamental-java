import java.util.Scanner;
public class TesGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan Nama :");
        String nama=input.nextLine();
        System.out.println("Masukan Peran :");
        String peran=input.nextLine();

        System.out.println("nama dan " + nama + peran);
        if (peran.isEmpty() &&  nama.isEmpty()){
            System.out.println("Nama dan Peran Harus Di Isi");
        }else if (peran.isEmpty()){
            System.out.println("Peran Harus Di Isi");
        }else{
            if (peran.equals("Superhero") || peran.equals("Monster")){
                if (peran.equals("Superhero")) {
                    System.out.printf("Selamat Datang Superhero %s, Kalahkan Semua Monster Di Muka Bumi\n",nama);
                }else{
                    System.out.printf("Selamat Datang Monster %s, Hancurkan Semua Superhero Yang Ada\n",nama);
                }
            }else{
                System.out.printf("Selamat Datang %s, Pilih Peranmu Untuk Melanjutkan Game Ini\n",nama);
            }
        }
    }
}
