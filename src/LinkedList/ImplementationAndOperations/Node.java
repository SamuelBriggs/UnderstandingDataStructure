package LinkedList.ImplementationAndOperations;

public class Node {
         int value;
         Node previousNode;
         Node nextNode;

    public Node(int value) {
        this.value = value;
        this.previousNode = null;
        this.nextNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

}
