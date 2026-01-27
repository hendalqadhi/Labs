package Queue;

public class main {
    public static void main(String[] args) {
/*LinkedQueue<String> lQueue=new LinkedQueue<String>();
lQueue.enqueue("Hend");
lQueue.enqueue("Sara");
lQueue.enqueue("Somia");
lQueue.enqueue("Asma");
System.out.println("The first is:"+lQueue.front());
while(!lQueue.isEmpty()){
    System.out.println("element removed ="+lQueue.dequeue());*/
        ArrayQueue<String> aQueue=new ArrayQueue<String>();
        aQueue.enqueue("Hend");
        aQueue.enqueue("Henooda");
        aQueue.enqueue("Hendo");
        System.out.println("the front is :"+aQueue.front());
        while (!aQueue.isEmpty()) {
            System.out.println("element removed=" + aQueue.dequeue());
        }
}
}

