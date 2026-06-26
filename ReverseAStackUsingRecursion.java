import java.util.Stack;

public class ReverseAStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer>s1=new Stack<>();
        s1.push(30);
        s1.push(10);
        s1.push(50);
        s1.push(20);
        for (int i=0;i<s1.size();i++){
            System.out.println(s1.elementAt(i));
        }
        System.out.println("=====================");
        reverse(s1);
        for (int i=0;i<s1.size();i++){
            System.out.println(s1.elementAt(i));
        }
    }
    public static void reverse(Stack<Integer>s1){
        if (s1.isEmpty()){
            return;
        }
        int top=s1.pop();
        reverse(s1);
        insert(s1,top);
    }
    public static void insert(Stack<Integer>s1,int val){
        if (s1.isEmpty()){
            s1.push(val);
            return;
        }
        int curr=s1.pop();
        insert(s1,val);
        s1.push(curr);
    }
}
