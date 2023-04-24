package LinkedList.ImplementationAndOperations;

import java.util.LinkedList;


public class DoublyLinkedList {

    private Node head = null;

    private Node tail = null;


    public void setHead(int element) {
        Node node = new Node(element);
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
        Node node = new Node(element);
        if (index == 0) setHead(element);
        else if (head.nextNode == null) return;
        else {
            int count = 1;
            Node currentNode = head.nextNode;
            while (count!= index){
                currentNode = currentNode.nextNode;
                count++;
            }
            if(currentNode == null) return;
            node.previousNode = currentNode.previousNode;
            currentNode.previousNode.nextNode = node;
            node.nextNode = currentNode;
            currentNode.previousNode = node;
        }

    }

    public int size(){
        if (head==null) return 0;
        int count = 1;
        Node currentNode = head.nextNode;
        while (currentNode!= null) {
            currentNode = currentNode.nextNode;
            count++;
        }
        return count;
    }

    public int get(int index){
        int count = 0;
        Node currentNode = head;
        while (count!=index) {
            currentNode = currentNode.nextNode;
            count++;
        }
        return currentNode.value;
    }
    public boolean contains(int element){
        Node node = head;
        while(node!=null){
            if (node.value == element) return true;
            else node = node.nextNode;
        }
        return false;
    }

    }
