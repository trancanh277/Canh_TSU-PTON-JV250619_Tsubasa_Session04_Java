import java.util.Scanner;

public class baitap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập kích thước mảng");

        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị %d của mảng %n", i + 1);
            arr[i] = sc.nextInt();
        }
        int tong = 0;
        for (int value: arr) {
            tong += value;
        }
        System.out.printf("Tổng các phần tử trong mảng là %d \n ", tong);
    }
}
