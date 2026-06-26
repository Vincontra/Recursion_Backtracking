import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer>s1=new Stack<>();
        s1.push(33);
        s1.push(31);
        s1.push(300);
        sort(s1);
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
    public static void sort(Stack<Integer>s1){
        if (s1.size()==1){
            return;
        }
        int val=s1.pop();


    }
    public static int insert(Stack<Integer>s1){
        return 0;

    }
}
