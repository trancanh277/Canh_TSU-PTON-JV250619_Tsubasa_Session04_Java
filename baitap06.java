import java.util.Scanner;

public class baitap06 {


    public static void sapXep(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static int nhiPhan(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int tuyenTinh(int[] arr, int targettt) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targettt) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập kích thước mảng");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị %d của mảng %n", i + 1);
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập");
        for (int value : array) {
            System.out.println(value + " ");
        }
        sapXep(array);
        System.out.println("Mảng sau khi sắp xếp");
        for (int value : array) {
            System.out.println(value + " ");
        }
        System.out.println("Nhập số cần tìm");
        int search = sc.nextInt();
        int result = nhiPhan(array, search);
        if (search != -1) {
            System.out.printf("Tìm kiếm nhị phân: Phần tử %d được tìm thấy tại chỉ số %d\n", search, result);
        }
        int resulttt = tuyenTinh(array, search);
        if (resulttt != -1) {
            System.out.printf("Tìm kiếm tuyến tính: Phần tử %d được tìm thấy tại chỉ số %d\n", search, resulttt);
        }

    }
}
