
import java.util.Scanner;
public class TesGanjilGenap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int data=input.nextInt();
        if (data < 1){
            System.out.println("Masukan Bilangan Positif");
        }else {
            int jumlahDeretGenap = 0;
            int jumlahGenap = 0;
            int jumlahGanjil = 0;
            int i = 1;
            while (jumlahDeretGenap < data) {
                if (i % 2 == 0) {
                    jumlahGenap += i;
                    jumlahDeretGenap++;
                } else {
                    if (i < data) {
                        jumlahGanjil += i;
                    }
                }
                i++;
            }
            System.out.println(jumlahGanjil);
            System.out.println(jumlahGenap);
        }
    }
}
