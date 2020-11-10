package src.linked;

public class Node {
    private int value;
    private Node next;

    Node(int _value){
        value = _value;
    }

    Node(int _value,  Node _next){
        value = _value;
        next = _next;
    }

    public int getValue(){
        return value;        
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node _next){
        next = _next;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
