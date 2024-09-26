import java.util.*;

// array 배열 길이가 선언시 정해진다
// list 길이가 가변
//        <type> 제네릭
//        StoreAction action = new Store()
public class StackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
        int p = stack.pop();
        System.out.println(p);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(10);
        System.out.println(queue.size());

    }
}