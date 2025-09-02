import java.util.Scanner;

public class baitap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị %d của mảng %n", i + 1);
            arr[i] = sc.nextInt();
        }
        sapXep(arr);
        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần:");
        for(int value: arr){
            System.out.print(value + " ");
        }
        System.out.println("\nPhần tử lớn nhất trong mảng " + arr[0]);
    }
    public static void sapXep(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }

            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
