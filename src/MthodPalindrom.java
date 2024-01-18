import java.util.*;
public class MthodPalindrom {
    public static void main(String[] args) {
        System.out.println(polindrom());
    }
    public static boolean polindrom(){
        Scanner input=new Scanner(System.in);
        String kata=input.next();
        char[] kataChar=kata.toCharArray();
        String kataKebalik="";
        for (int i = 0; i < kataChar.length; i++) {
            kataKebalik += kataChar[kataChar.length-1-i];
        }
        return (kata.equals(kataKebalik));
    }
}
