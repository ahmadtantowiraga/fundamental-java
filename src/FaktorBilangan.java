import java.util.Scanner;
public class FaktorBilangan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bil=input.nextInt();
        for (int i=1;i<=bil;i++){
            if (bil%i==0){
                System.out.println(i);
            }
        }
    }
}
