import gtest.Food;
import gtest.Order;
import gtest.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
        System.out.print(answer[0]+", "+answer[1]);


        // Q4.
        // answer의 순서 O
    }
}