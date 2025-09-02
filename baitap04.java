import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng");
        int size = sc.nextInt();
        int[] array = new int[size];
        int n = array.length;
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị %d của mảng %n", i + 1);
            array[i] = sc.nextInt();
        }
        if(size <= 0){
            System.out.println("Kích thước rỗng");
            return;
        }
        System.out.println("Mảng ban đầu:");
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược:");
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.println();
    }
    }

