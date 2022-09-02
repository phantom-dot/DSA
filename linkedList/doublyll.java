package linkedList;

class cll
{
    node head;
    node tail;
    boolean isempty;
    static class node
    {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    public cll() {
        this.head = null;
        this.tail = null;
    }



    public void insert(int val)
    {
        node node=new node(val);
         if (head==null)
         {
            head=node;
            tail=node;
            return;
         }
         tail.next=node;
         node.next=head;
         tail=node;

    }

    public void print()
    {
        if (isempty)
        {
            System.out.println("link is empty");
            return;
        }

        node temp=head;
       do {
           System.out.print(temp.data+"-> ");
           temp=temp.next;
       }while (temp!=head);
        System.out.println(head.data);
    }

    public void del(int data) {
        node node = head;
        if (node == null) {

            return;
        }
        if (head.next == tail.next)
        {
            tail.next=null;
            head.next=null;
            isempty=true;
        }
        if (data==head.data)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            node n=node.next;
            assert n != null;
            if (n.data==data) {
                node.next=n.next;
                break;
            }

            node=node.next;
        }while (node!=head);


    }
}


public class doublyll {

    public static void main(String[] args) {
        cll l=new cll();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.del(1);




        l.print();

    }
}
