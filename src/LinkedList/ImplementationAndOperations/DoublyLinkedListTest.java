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
        linkedList.setHead(1);
        Node node1 = new Node(6);
        linkedList.setHead(2);
        System.out.println(linkedList);
        LinkedList linkedList1 = new LinkedList<>();

    }

    @Test
    public  void testAddMethod(){
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Node node = new Node(7);
        linkedList.setHead(45);
        //linkedList.add(8);
        //linkedList.add(5);
      //  linkedList.add(6);
        Node node1 = new Node(98);
        linkedList.setHead(56);
        System.out.println(linkedList);
        System.out.println(linkedList.getTail());
        System.out.println(linkedList.getHead());

    }
    @Test
    public void testInsertAtIndexMethod(){

        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.add(5);
        linkedList.add(6);
         linkedList.add(7);
         linkedList.add(10);
         linkedList.add(13);

        System.out.println(linkedList);
        System.out.println(linkedList.size());
        linkedList.add(1, 19);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.getTail());
        System.out.println(linkedList.contains(19));


    }

}