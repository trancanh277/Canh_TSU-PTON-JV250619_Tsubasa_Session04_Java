import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int hang = sc.nextInt();
        System.out.println("Nhập số cột");
        int cot = sc.nextInt();
        int [][] arr = new int[hang][cot];
        System.out.println("Nhập các  phần tử cho mảng (theo từng hàng)");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhập phần tử ở hàng %d, cột %d: ", i + 1, j + 1);
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("Mảng vừa nhập là");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        int tongchan = 0, tongle = 0;
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if(arr[i][j] % 2 == 0){
                    tongchan += arr[i][j];
                }
                else {
                    tongle += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử chẵn = " + tongchan);
        System.out.println("Tổng các phần tử lẻ = " + tongle);
    }
}
