package DoublyLinkedList;

public class main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist = new DoublyLinkedList<Integer>();
        dlist.addFirst(10);
        dlist.addFirst(10);
        dlist.addLast(30);
        dlist.addLast(40);
        dlist.addLast(50);
        dlist.removeLast();
        dlist.removeFirst();
        dlist.display();
    }
}
