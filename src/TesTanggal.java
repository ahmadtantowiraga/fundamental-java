import java.util.Scanner;

public class TesTanggal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tanggal = input.nextInt();
        int bulan = input.nextInt();
        int tahun = input.nextInt();
        switch(bulan){
            case 1:
                System.out.printf(" %d Januari %d",tanggal,tahun);
                break;
            case 2:
                System.out.printf(" %d Febuari %d",tanggal,tahun);
                break;
            case 3:
                System.out.printf(" %d Maret %d",tanggal,tahun);
                break;
            case 4:
                System.out.printf(" %d April %d",tanggal,tahun);
                break;
            case 5:
                System.out.printf(" %d Mei %d",tanggal,tahun);
                break;
            case 6:
                System.out.printf(" %d Juni %d",tanggal,tahun);
                break;
            case 7:
                System.out.printf(" %d Juli %d",tanggal,tahun);
                break;
            case 8:
                System.out.printf(" %d Agustus %d",tanggal,tahun);
                break;
            case 9:
                System.out.printf(" %d September %d",tanggal,tahun);
                break;
            case 10:
                System.out.printf(" %d Oktober %d",tanggal,tahun);
                break;
            case 11:
                System.out.printf(" %d November %d",tanggal,tahun);
                break;
            case 12:
                System.out.printf(" %d November %d",tanggal,tahun);
                break;
            default:
                System.out.printf("Bulan hanya ada 1 - 12");
        }
    }
}
