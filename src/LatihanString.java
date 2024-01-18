import java.util.*;
public class LatihanString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kata=input.next();
        String kataKebalik="";
        for (int i=0;i < kata.length();i++){
            kataKebalik+=kata.charAt(kata.length()-i-1);
        }
        System.out.println(kataKebalik);
    }
}
