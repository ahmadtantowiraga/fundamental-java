import java.util.Arrays;

public class LatihanAray {
    public static void main(String[] args) {
        int[] data_arrays={75,80,95,60,85,22,32,18};
        int[] data2=Arrays.copyOf(data_arrays,data_arrays.length);
        int jumlah=0;
        for (int i=0;i < data_arrays.length;i++){
            jumlah+=data2[i];
            for (int j = 0; j < data_arrays.length-1; j++) {
                if (data_arrays[j] > data_arrays[j+1]){
                    int temp=data_arrays[j+1];
                    data_arrays[j+1]=data_arrays[j];
                    data_arrays[j]=temp;
                }
            }
        }
        System.out.println("rata-rata : " + jumlah/data_arrays.length);
        System.out.println("jumlah seluruh nilai : " + jumlah);
        System.out.println("nilai minimum : " + data_arrays[0]);
        System.out.println("nilai maksimum : " + data_arrays[data_arrays.length-1]);
        System.out.println("Setelah di urutkan : " + Arrays.toString(data_arrays));
    }
}
