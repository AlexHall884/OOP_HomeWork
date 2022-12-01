package HomeWork3;

import java.util.Iterator;

public class MyList<E> implements Iterable<E> {
    private Node first;
    private Node last;
    

    public MyList(Node first) {
        this.first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(E value) {
        Node tempo = new Node();
        tempo.setValue(value);
        tempo.setNext(null);

        if (first == null) {
            tempo.setPrev(null);
            first = last = tempo;
        } else {
            tempo.setPrev(last);
            last.setNext(tempo);
            last = tempo;
        }
    }
    public Iterator iterator(){
        return new Iterator<E>() {
            Node<E> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }
            
            @Override
            public E next() {
                E value = current.getValue();
                current = current.getNext();
                return value;
            }
        };
    }
}
