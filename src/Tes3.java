import java.util.Scanner;
public class Tes3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int jam=input.nextInt();
        if(jam >= 8 && jam <= 12 || jam >= 14 && jam <= 17){
            System.out.println("JAM BELAJAR");
        }else if(jam > 24 || jam < 1){
            System.out.println("WAKTU HANYA 24 JAM");
        }else{
            System.out.println("JAM ISTIRAHAT");
        }
    }
}
