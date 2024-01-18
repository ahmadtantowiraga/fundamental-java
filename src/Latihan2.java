import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        int hasil=faktorial(10);
        System.out.println(hasil);
    }
    static int faktorial(int nilai){
        if (nilai==1){
            return 1;
        }else if(nilai==0){
            return 1;
        }
        return nilai*faktorial(nilai-1);
    }
}
