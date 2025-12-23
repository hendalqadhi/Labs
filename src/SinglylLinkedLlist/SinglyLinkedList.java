package SinglylLinkedLlist;

public class SinglyLinkedList<E> {

    //FIRST LECTURE IN LINKED LIST
   private Node<E> head=null;
   private Node<E> tail=null;
    private int size=0 ;
    private int size (){return size;}
    public boolean isEmpty(){
        return size()==0;
    }
    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public E getData() {
            return data;
        }

        public Node(Node<E> next) {
            this.next = next;
        }
    }



    }

