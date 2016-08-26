import java.util.Iterator;

/**
 * Created by ander on 8/25/2016.
 */

public class MyLinkedList<T> implements Iterable<T> {

    private Node<T> mHead;
    private int counter = 0;
    private Node<T> current;
    String[] array;


    protected MyLinkedList(String[] array, int size) {
        this.array = array;
        this.counter = size;
    }

    protected int getCounter() {
        return counter;
    }

    protected boolean remove(int index) {
        Node previous = mHead;
        Node current = mHead;
        Node nextValue = mHead;
        if (mHead != null) {
            for (int i = 0; i <= index; i++) {
                previous = current;
                current = current.next;
                if (i == counter) {
                    previous = null;
                    counter --;
                    return true;
                } else if (index == 0) {
                    mHead = mHead.getNext();
                    counter --;
                    return true;
                } else if (i == index - 1) {
                    previous = current.getNext();
                    counter --;
                    return true;
                } else if (i == index) {
                    nextValue = current.getNext();
                    previous.setNext(nextValue);
                    counter --;
                    return true;
                }
                else {
                    previous.setNext(current.getNext());
                }
            }
            counter --;
            return true;
        } else {
            return false;
        }
    }

    public T get(int index) {
        //to-
        Node<T> current = mHead;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }

        return current.getData();
    }

    public void add(Object obj) {
        if (mHead == null) {
            mHead = new Node(obj);
        }
        Node newNode = new Node(obj);
        Node currentPlacement = mHead;
//
        if (currentPlacement != null) {
        while (currentPlacement.getNext() != null) {
            currentPlacement = currentPlacement.getNext();
//            System.out.println("merp" + counter);
//            System.out.println( currentPlacement.toString());
        }
        currentPlacement.setNext(newNode);
        }
        counter++;
    }

    //The methods below are bonus

    public void add(int index, T obj) {
        //to-do
        if (mHead == null) {
            mHead = new Node<T>(obj);
        }
        counter++;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
//        return new MyLinkedList.MyIterator<T>(mHead);
        return null;
    }

    private class MyIterator<T> implements Iterator<T> {

        private Node<T> node;

        public MyIterator(Node<T> node) {
            //to-do
        }

        @Override
        public boolean hasNext() {
            //to-do
            if (current.next != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public T next() {
            //to-do
            if (hasNext() == false) {
                System.out.println("There is no next item");
            }
            current = current.next;
            T name = (T) current.data;
            return name;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub

        }

    }
}
