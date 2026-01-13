package Queue;

public class main {
    public static void main(String[] args) {
LinkedQueue<String> lQueue=new LinkedQueue<String>();
lQueue.enqueue("Hend");
lQueue.enqueue("Sara");
lQueue.enqueue("Somia");
lQueue.enqueue("Asma");
System.out.println("The first is:"+lQueue.front());
while(!lQueue.isEmpty()){
    System.out.println("element removed ="+lQueue.dequeue());
}




    }
}
