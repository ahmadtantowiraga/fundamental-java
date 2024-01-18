import java.util.Arrays;
import java.util.Scanner;
public class BelajarArray {
    public static void main(String[] args) {
        String[] arrays=new String[3];
        arrays[0]="aku";
        arrays[1]="kamu";
        arrays[2]="kita";

        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[2]);
        System.out.println(Arrays.toString(arrays));
        String[] arrays2=arrays;
        System.out.println(Arrays.toString(arrays2));
        arrays2[0]="jahat";
        System.out.println(Arrays.toString(arrays2));
        System.out.println(Arrays.toString(arrays));
        for (int i=0;i < arrays2.length;i++){
            System.out.println(arrays[i]);
        }

        for(String i:arrays2){
            System.out.println(i);
        }
        String[] nama=new String[3];

        System.out.println(nama[0] == null);


        String ahmad="Ahmad tanto";
        char[] ah=ahmad.toCharArray();
        String[] mad=ahmad.split(" ");
        System.out.println(Arrays.toString(ah));
        System.out.println(Arrays.toString(mad));

        char[] tow=Arrays.copyOf(ah,ah.length);
        System.out.println(Arrays.toString(tow));

        String[] arrays1=new String[3];
        arrays1[0]="aku";
        arrays1[1]="kamu";
        arrays1[2]="kita";
        System.out.println(Arrays.toString(arrays1));

        arrays1=new String[4];
        System.out.println(Arrays.toString(arrays1));

        Scanner input=new Scanner(System.in);
        System.out.println("Masukan panjang Array : ");
        int data= input.nextInt();
        int[] arr=new int[data];
        for (int i = 0; i < data; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[][] matriks=new int[3][3];
        matriks[0][2]=4;
        matriks[1][1]=2;
        matriks[2][0]=3;
        System.out.println(Arrays.deepToString(matriks));
        int[][][][] matrisk2={{{{1,3},{2,4}},{{3,4},{2,4}}},{{{3,2},{2,5}},{{2,3},{2,9}}}};
        System.out.println(Arrays.deepToString(matrisk2));
        System.out.println(Arrays.deepToString(matrisk2[0]));

        int[][] matriks3={
                {1,2,3},
                {1,2,3,4,5,6},
                {2,4,5,6}
        };
        System.out.println(Arrays.deepToString(matriks3));

        for (int i = 0; i < matriks3.length; i++) {
            for (int j = 0; j < matriks3[i].length; j++) {
                System.out.println(matriks3[i][j]);
            }
        }
        for (int[] j : matriks3){
            for( int i : j){
                System.out.println(i);
            }
        }

    }

}
