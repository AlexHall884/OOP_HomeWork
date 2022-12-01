package HomeWork3;

import java.util.Iterator;

public class UserList<E> implements Iterable<Node>{
    int size = 0;
    Node<E> first;
    Node<E> last;
    

    public UserList(int size, Node<E> first, Node<E> last) {
        this.size = size;
        this.first = first;
        this.last = last;
    }
}
