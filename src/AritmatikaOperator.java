
public class AritmatikaOperator {
    public static void main(String[] args) {
        int a, b, hasil1, hasil2, hasil3;
        a=16;
        b=23;
        hasil1=a+b;
        hasil2=a-b;
        hasil3=a*b;
        double hasil4=(double) a/b;
        double hasil5=Math.sqrt((double) a);
        double hasil6=Math.pow(3,3);
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(hasil4);
        System.out.println(hasil5);
        System.out.println(hasil6);
        byte f=12;
        byte g=23;
        byte hasil9=(byte) (f +  g);
        System.out.println(hasil9);
        // % = modulo sisa bagi
        int d=-12;
        int e=7;
        int o=d%e;
        System.out.println(o);
        //d=d+1 : increment
        System.out.println(d++);
        System.out.println(++d);
        //d=d-1 : decrement

        System.out.println("Operator Assignment");
        int v=10;

        v+=10; // e=e+10
        v-=10;
        v*=2;

        System.out.println("ahmad");




    }
}
