//Date: 6/29/2024
//Programmer: Geoffrey Grossthal
//Program: Represents a generic stack implementation using a linked list structure.


import java.util.EmptyStackException;

public class MyStack<E> {

    //Node class for each element of the stack
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    //Node will represent the top of the stack
    private Node<E> top;

    //Constructs empty stack
    public MyStack() {
        this.top = null;
    }

    //Pushes element to the top of the stack
    public void push(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
    }

    //Pops element from the top of the stack
    public E pop() {
        if (isEmpty())
            throw new EmptyStackException();
        E data = top.data;
        top = top.next;
        return data;
    }

    //Returns element from the top of the stack
    public E peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return top.data;
    }

    //Returns true if stack is empty otherwise false
    public boolean isEmpty() {
        return top == null;
    }

    //Returns a string representation of the stack from top to bottom
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = top;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
