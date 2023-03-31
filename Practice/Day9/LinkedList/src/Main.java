class Main {

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;

        }
    }

    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }

        head = head.next;
    }

    // delete last

    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    //add - last
    public static void main(String[] args) {
        Main list = new Main();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addlast("list");
        list.addFirst("this");

        list.printList();
    }
}