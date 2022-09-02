package linkedList;

public class ll {
    int size;
    node head;
    node tail;

    static class node {
        //defines a structure of a node
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }

        public node(int data, node next) {
            this.data = data;
            this.next = next;
        }
    }

    public node reverseList() {

        node p = head;
        node m = head.next;
        node n = head.next.next;


        while (n != null) {
            m.next = p;
            n.next = m;

            p = p.next;
            m = m.next;
            n = n.next;
        }

        head.next = null;
        head = n;

        return head;

    }

    public void insert(int val) {
        node node = new node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;

    }

    public void insertend(int val) {
        if (tail == null) {
            insert(val);
            return;
        }
        node node = new node(val);
        tail.next = node;
        tail = node;


        size += 1;

    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void inserati(int val, int i) {
        node node = new node(val);
        node temp = head;
        for (int j = 1; j < i - 1; j++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

        size += 1;

    }

    public void delfirst() {
        head = head.next;
        if (head == null)
            tail = null;

    }

    public node returnindex(int i) {
        node node = head;
        for (int j = 1; j < i; j++) {
            node = node.next;
        }
        return node;
    }


    public void delend() {
        tail = returnindex(size - 1);
        tail.next = null;


    }

    public void delati(int i) {


        node index = returnindex(i - 1);
        index.next = index.next.next;
    }

    public node findnode(int i) {
        node temp = head;
        while (temp.data != i) {
            temp = temp.next;
        }
        System.out.println(temp.data);
        return temp;
    }


    public ll() {
        this.size = 0;
    }


}
