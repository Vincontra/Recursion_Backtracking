import java.util.*;
public class SortAStack {
    static void sort(Stack<Integer>s1){
        if (s1.isEmpty()){
            return;
        }
        int top=s1.pop();
        sort(s1);
        insertSorted(s1,top);
    }
    static void insertSorted(Stack<Integer>s1,int value) {
        if (s1.isEmpty()||s1.peek()<=value){
            s1.push(value);
            return;
        }
        int top=s1.pop();
        insertSorted(s1, value);
        s1.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(30);
        s1.push(10);
        s1.push(50);
        s1.push(20);
        sort(s1);
        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }
    }
}