import java.util.Scanner;
public class Tes2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int jam=input.nextInt();
        if(jam < 8 || jam > 15){
            System.out.println("Failed");
        }else{
            System.out.println("Success");
        }
    }
}
