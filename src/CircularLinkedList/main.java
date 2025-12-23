package CircularLinkedList;

public class main {
    public static void main(String[] args) {
        CircularLinkedList<String> list=new CircularLinkedList<String>();
        list.addFirst("Hend");
        list.addlast("Heba");
        list.addFirst("Hanaa");
        list.removeFirst();
        list.removeLast();
        list.addFirst("Yumna");
        list.addFirst("Noor");
        list.display();
    }

}
