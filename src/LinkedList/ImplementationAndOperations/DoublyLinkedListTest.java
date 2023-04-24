package LinkedList.ImplementationAndOperations;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {




    @Test
    public void testSetHeadMethod(){
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Node node = new Node(5);
        node.nextNode = null;
        linkedList.setHead(node);
        Node node1 = new Node(6);
        linkedList.setHead(node1);
        System.out.println(linkedList);
        LinkedList linkedList1 = new LinkedList<>();

    }

    @Test
    public  void testAddMethod(){
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Node node = new Node(7);
        linkedList.setHead(node);
        //linkedList.add(8);
        //linkedList.add(5);
      //  linkedList.add(6);
        Node node1 = new Node(98);
        linkedList.setHead(node1);
        System.out.println(linkedList);
        System.out.println(linkedList.getTail());
        System.out.println(linkedList.getHead());

    }

}