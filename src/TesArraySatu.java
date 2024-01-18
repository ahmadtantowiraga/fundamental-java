import java.util.*;
public class TesArraySatu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kata=input.next();
        char[] kataChar=kata.toCharArray();
        String kataKebalik="";
        for (int i = 0; i < kataChar.length; i++) {
            kataKebalik += kataChar[kataChar.length-1-i];
        }
        System.out.println(kata.equals(kataKebalik));
    }
}
