import java.util.*;

public class baitap07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        int size = sc.nextInt();
        int[]arr= new int[size];
        for(int i=0;i<size;i++){
            System.out.printf("Nhập vào phần tử mảng thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        if (size<=0){
            System.out.println("Mảng không hợp lệ");
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int value: arr){
            map.put(value, map.getOrDefault(value, 0) + 1);

        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()== 1){
                list.add(entry.getKey());
            }
        }
        if(list.isEmpty()){
            System.out.println("Không có phần tử nào duy nhất trong mảng");
        } else {
            System.out.println("Mảng sau khi loại bỏ phần tử trùng lặp:");
            for(int value: list){
                System.out.println(value +" ");
            }
        }

    }
}
