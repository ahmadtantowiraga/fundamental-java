import java.util.Scanner;
public class tes1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int data=input.nextInt();
        if(data%2==1){
            System.out.println("Ganjil");
        }else{
            System.out.println("Genap");
        }
    }
}
