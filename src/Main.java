import gtest.Food;
import gtest.Order;
import gtest.Product;

import java.util.*;

// array 배열 길이가 선언시 정해진다
// list 길이가 가변
//        <type> 제네릭
//        StoreAction action = new Store()
public class Main{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(9);

        int target = 9;
        int[] answer = new int[2];

        // Q3.
        // 1 <= list 안에 있는 수 <= 10
        // answer의 순서 O
        int[] tmp = new int[11];
        for (int i=0; i<list.size();i++) tmp[list.get(i)] = i+1;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i]==0) continue;
            if (tmp[target - i]!=0) {
                if(tmp[target - i] < tmp[i]) {
                    answer[0] = target - i;
                    answer[1] = i;
                }else {
                    answer[0] = i;
                    answer[1] = target-i;
                }
                break;
            }
        }
        System.out.printf("Q3) %d, %d\n", answer[0], answer[1]);


        // Q4.
        // answer의 순서 O
        int maxNum = Collections.max(list);
        int[] tmp2 = new int[maxNum+1];
        for (int i=0; i<list.size();i++) tmp2[list.get(i)] = i+1;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp2[i]==0) continue;
            if (tmp2[target - i]!=0) {
                if(tmp2[target - i] < tmp2[i]) {
                    answer[0] = target - i;
                    answer[1] = i;
                }else {
                    answer[0] = i;
                    answer[1] = target-i;
                }
                break;
            }
        }
        System.out.printf("Q4) %d, %d\n", answer[0], answer[1]);
    }
}