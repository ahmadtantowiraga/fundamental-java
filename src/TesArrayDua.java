import java.util.Arrays;

public class TesArrayDua {
    public static void main(String[] args) {
        int[] arr ={7,20,39,2,48,520,5,5};
        for (int i=0;i < arr.length;i++){
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
