import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
             array[i] = sc.nextInt();
        }
        bubble(array);
        for (int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }


    }

    public static void bubble(int[] array){

        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {

                if (array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }


            }

        }

    }
}
