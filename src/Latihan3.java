import java.util.Arrays;
public class Latihan3 {
    public static void main(String[] args) {
        int[] aray=new int[3];
        aray[0]=1;
        aray[1]=2;
        aray[2]=3;
        System.out.println(Arrays.toString(aray));
        System.out.println(aray);
        int[] aray2=Arrays.copyOf(aray,3);

        System.out.println(Arrays.toString(aray2));
        System.out.println(aray2);

        int[] aray3=Arrays.copyOfRange(aray2,0,2);
        System.out.println(Arrays.toString(aray3));
        System.out.println(aray3);

        int[] aray4=new int[5];
        Arrays.fill(aray4,8);
        System.out.println(Arrays.toString(aray4));

        int[] aray5={2,3,3,4};
        int[] aray6={1,3,3,20};

        //Kompare aray
        System.out.println(Arrays.equals(aray5,aray6));//boolean
        System.out.println(aray5.length==0);


        System.out.println(Arrays.compare(aray5,aray6));//hasil integer

        System.out.println(Arrays.mismatch(aray5,aray6));//hasil integer indexx

        int[] aray7={1,7,4,8,9,3,5,2};
        Arrays.sort(aray7);
        int[] aray8=Arrays.copyOf(aray7,aray7.length);
        System.out.println(Arrays.toString(aray7));

        System.out.println(Arrays.binarySearch(aray7,8));


        int[] aray9={1,2,4,8,5,3,7,9};
        int[] aray10={2,4,5,7,8,1,6,7};
        int[] hasil=new int[aray9.length];
        for(int i=0; i < aray9.length; i++){
            hasil[i]=aray9[i]+aray10[i];
        }
        System.out.println(Arrays.toString(hasil));
        int[][] aray11={{1,2,3},{2,3,4},{3,4,5}};
        System.out.println(Arrays.deepToString(aray11));
        System.out.println(Arrays.toString(aray11[0]));

    }
}
