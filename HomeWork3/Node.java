package HomeWork3;

public class Node<E> {
    
    private Node next;
    private Node prev;
    private E value;
    
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    public E getValue() {
        return value;
    }
    public void setValue(E value) {
        this.value = value;
    }

    

}
