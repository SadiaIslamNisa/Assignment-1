package test.edu.generics;



/**
 * An implementation of the stack interface using singly-linked
 * nodes.
 */
public class LinkedStack<Item> {
	private Node first = null;

    private class Node {
        Item item;
        Node next;
    }

    public boolean IsEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
    }

}