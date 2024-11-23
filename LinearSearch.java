import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }
        linear(array,sc);
    }
    public static void linear(int[] array,Scanner sc){

        System.out.println("Eneter the element to found: ");
        int found = sc.nextInt();
        boolean isfound = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == found){
                System.out.println("Element is found at the index of "+i);
                isfound = true;
                break;
            }

        }
        if(!isfound){
            System.out.println("Element is not in the array");
        }

    }
}
