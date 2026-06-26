import java.util.Stack;

public class DeleteMiddleElementOfStack {
    public static void main(String[] args) {
        Stack<Integer>s1=new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        for (int i=0;i<s1.size();i++){
            System.out.println(s1.elementAt(i));
        }
        System.out.println("=====================");
        int size=s1.size();
        delete(s1,size);

        for (int i=0;i<s1.size();i++){
            System.out.println(s1.elementAt(i));
        }



    }
    public static void delete(Stack<Integer>s1,int tot){
        if (s1.size()==(tot+1)/2){
            s1.pop();
            return;
        }
        int curr=s1.pop();
        delete(s1,tot);
        s1.push(curr);
    }
}
