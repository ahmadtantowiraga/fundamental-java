import java.util.Objects;
import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        int data= input.nextInt();
//        Integer data2= data;
//        if(data ==9){
//            System.out.println("ganteng");
//        }else if(data > 7){
//            System.out.println("Lumayan");
//        }
//        else{
//            System.out.println("jelek");
//        }
//        if(data > 9){
//            if(data <= 10 ) {
//                System.out.println("Keren");
//            }else{
//                System.out.println("Anda alien");
//            }
//        }else if (data > 5){
//            System.out.println("lumayanlah");
//        }else if(data >= 0){
//            System.out.println("bodoh");
//        }else{
//            System.out.println("Mana ada nilai minus");
//        }
//        String result= (data >= 80) ? "Good" : "Bad";
//        System.out.println(result);

//       int hasil=data >=80 ? 2 : 1;
//        System.out.println(hasil);
        int grade=8;
        switch (grade){
            case 9:
                System.out.println("ganteng");
                break;
            case 8:
                System.out.println("jahat");
                break;
            default:
                System.out.println("apasih");
        }
    }
}
