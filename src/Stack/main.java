package Stack;

public class main {
    public static void main(String[] args) {
       /* LinkedStack<Integer> slist=new LinkedStack<Integer>();
        slist.push(10);
        slist.push(20);
        slist.push(30);
        slist.push(40);
        slist.pop();
        slist.pop();
        slist.display();*/

        ArrayStack<Integer> aStack=new ArrayStack<Integer>(10);
        aStack.push(10);
        aStack.push(20);
        aStack.push(30);
        aStack.push(40);
        aStack.push(50);
        aStack.push(60);
        aStack.top();
        while(!aStack.isEmpty()){
            System.out.println("removed element ="+aStack.pop());
        }

    }
}
