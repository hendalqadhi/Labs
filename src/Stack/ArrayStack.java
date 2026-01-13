package Stack;

public class ArrayStack <E> implements Stack<E>{
 private E arr[];
 private  final int CAPACITY=1000;
 private int t=-1;
 public ArrayStack(){
     arr= (E[]) new Object[CAPACITY];
      //this(CAPACITY);
 }
 public ArrayStack(int c){
     arr= (E[]) new Object[c];

 }
    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E data) {
    if(size()== arr.length){
        System.out.println("The array is full");
       // throw new IllegalStateException("Cannot add more ,stack is full")
    }else
        arr[++t]=data;

    }

    @Override
    public E top() {
     if(isEmpty()) return null;
        return arr[t];
    }

    @Override
    public E pop() {
     if(isEmpty()) return null;
     E delete=arr[t];
     arr[t]=null;
     t--;
     return delete;
    }
}
