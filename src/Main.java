public class Main {
    // komentar

//    public static void main(String[] args) {
//    //cara membuat etry poin
//
//    }
    /*komentar multi line
    * wqduqhwdu\
    * wedjwfehew*/

    // tidak boleh membuat varibale diawali angka
    // special karakter cuma % dan $
    // tipeData namaVariable = isi;
//    public static void main(String[] args) {
//        // variable -> wadah kita menyimpan sebuah nilai
//        // di java static typelanguage
//        int number = 10; //jangan nulis variale dengan simple
//        int Number= 11;
//        //reassign
//        number=15;
//        number=Number;
//        System.out.println(Number);
//        // memanipulasi data pada varibale || varibale di java -> mutable
//        //
//
//        // System = class
//        // println = menvetak nilai dibaris selanjutnya
//        // print= mencetak niai setelah klaimat
//        // printf= mencetak nilai dengan format
//        // special karakter cuma % dan $
////        System.out.println(numberVariable);
////        System.out.print(10);
////        System.out.println("kaki");
//
//}
    //tipe data
    public static void main(String[] args) {
        //Tpe data
        //*Primitif
        // boolean, byte, short, int, long, double, float, char
        // numeric: byte, short, int, long
        byte Byte=127; // -128 - 127
        short Short=10000; // -32.768 - 32.767
        int intNumber=1000000000; // -2^31 - 2^31 -1
        long onNumber=1000000000000000000L;

        //floating point double64 bit dan float 32 bit
        float fNumber=150000000000000000000000000000000000.50f;
        double doubleNumber=10000000000000000000000000000000000000000000.50;
        boolean isStudent=false;
        boolean hasMoney=true;

        char simpleCara='A';
        // tipe data non primitif
        //String, Boolean, Character, Byte, Long, Float, Double
        // Non Primitive memiliki fungsi tambahan di dlam classsnya
        String fullName="Budiman";
        System.out.println(fullName.toLowerCase());
        double i=10;
        int l=12;
        double k=i+l;

        //Konversi tipe data
        //Konversi implisit (otomatis)
        // dari tipe data kecil ke besar
        short a=20;
        int b=a;
        System.out.println(b);
        //konfersi eksplisit (manual) disebut casting
        int c=140;
        short d= (short) c;
        System.out.println(d);
        String as=String.valueOf(d);
        System.out.println(as.charAt(0));
        int ad=Integer.parseInt(as);
        //unboxing =non primitif ke primitif
        //outuboxing=primitif ke non promitif
        //final tidak bisa diubah
        final String AHMAD_TANTO="Ahmad tanto";
        System.out.println("ahmad");
    }
}
