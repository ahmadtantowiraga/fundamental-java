import java.util.Arrays;

public class MethodExample {
    public static void main(String[] args) {
        printHelloWorld();
        String halo=printHello();
        System.out.println(halo);
        int angka=angka();
        System.out.println(angka);
        System.out.println(MthodPalindrom.polindrom());
        sayHello("budi",23);
        prinArrayNumber("ahmad", 2,3,4,5,6,7,7,8);
        String[] buah={"apel","jeruk","melon"};
        int[] angka2={1,2,3,4};
        printFruits(buah);
        printFruits(new String[] {"ahmad","mangga","Apel"});
        prinArrayNumber("ihmid",angka2);
    }

    /*
    * method structure
    * penulisan : acces_modifier , static/non_static return_type/void namaMethod(parameter){
    *
    * statement/block code
     * }
     *Parameter argument -> parameter yang bisa kita isi argumen tanpa batas
     * System.out.printf( "%s,"123", "123","123","123");
     * Parameter argument hanya bisa diguakan di akhir parameter
     */

    public static void printFruits(String[] fruits){
        System.out.println(Arrays.toString(fruits));
    }
    public static void prinArrayNumber(String nama, int... args){
        System.out.println(Arrays.toString(args));
    }
    public static void sayHello(String name,int age){
        System.out.println("Hello "+ name + "\n Umur" + age);
    }
    public static void printHelloWorld(){
        System.out.println("Hello Dunia");
    }
    public static String printHello(){
        return "hello gaes";
    }
    public static int angka(){
        return 12;
    }

}
