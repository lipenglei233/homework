package text;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args){

    }

    public class MyList<E>{
        Node head,tail;
        public static final int INITIAL_CAPACITY = 16;
        private E[] data = (E[])new Object[INITIAL_CAPACITY];
        int size;

        public class Node{
            E element;
            Node next;
    
            public Node(E e){
                element = e;
            }
        }

        public MyList(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void add(E element){
            Node newNode = new Node(element);
            if(this.head == null){
                this.head = newNode;
            }
            this.tail = newNode;
        }

        //begin
        public boolean addAll(MyList<E> otherList){
            MyList<E> newData;

            for(int i = 0;i < data.length;i++){

            }

            return true;
        }

        public void removeAll(){
            this.head = null;
            this.tail = null;
        }


    }

    
}
