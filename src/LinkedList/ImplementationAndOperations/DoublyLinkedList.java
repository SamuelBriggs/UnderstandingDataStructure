package LinkedList.ImplementationAndOperations;

import java.util.LinkedList;


public class DoublyLinkedList {

    private Node head = null;

    private Node tail = null;


    public void setHead(Node node) {
        if (head == null){
            head = node;
            tail = node;
        }
        else {
        Node tempNode = head;
        head.previousNode = node;
        head = node;
        head.nextNode = tempNode;}
    }

    public boolean add (int element){
        Node node = new Node(element);
        if (head == null){
            head = node;
            tail = node;
        }
        else {
            Node currentNode = head;
            while (currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = node;
            node.previousNode = currentNode;
            node.nextNode = null;
            tail = node;
        }
        return true;
    }

    @Override
    public String toString() {
        String retStr = "Contents:\n";
        Node current = head;
        while (current != null) {
            retStr += current.getValue() + " ";
            current = current.getNextNode();

        }

        return retStr;
    }

    public int getTail(){
        return tail.value;
    }
    public int getHead(){
        return head.value;
    }

    public void add(int index, int element){




    }
}