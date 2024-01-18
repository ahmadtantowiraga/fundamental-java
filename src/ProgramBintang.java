import java.util.Scanner;
public class ProgramBintang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int jumlah=input.nextInt();
        int i=1;
        while(i < jumlah*2){
            for (int j=1;j<=jumlah;j++){
                if (i <= jumlah){
                    if (j <= i){
                        System.out.print("*");
                    }
                }else {
                    if (i + j <= (jumlah * 2)) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
            i++;
        }
    }
}
