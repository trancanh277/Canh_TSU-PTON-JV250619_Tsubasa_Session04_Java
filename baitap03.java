import java.util.Scanner;

public class baitap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị %d của mảng %n", i + 1);
            arr[i] = sc.nextInt();
        }
        sapXep(arr);
        System.out.println("Mảng sau khi đã sắp xếp");
        for(int value : arr){
            System.out.printf( value + " ");
        }

    }
    public  static void sapXep(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n -1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
