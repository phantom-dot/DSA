package linkedList;


class dll
{
    node head;


    int size;

    //creating a structure of node
    static class node
    {
        int data;
        node next;
        node prev;

        public node(int data, node next, node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public node(int data) {
            this.data=data;
        }
    }

    //constructor setting link list size=0
    public dll() {
        size=0;
    }

    public node findnode(int i)
    {
        node temp=head;
        while(temp!=null)
        {
            if (temp.data==i)
            {
                return temp;
            }
                temp=temp.next;
        }
        return null;
    }

    //insert at index i
    public void inserti(int data,int after)
    {
        node p=findnode(after);
        if (p==null)
        {
            System.out.println("DOESN'T EXIST");
            return;
        }
        node node=new node(data);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null) {
            p.next.prev = node;
        }



    }









    //function to insert at first
    public void insertFirst(int data)
    {
        node node = new node(data);

        node.next=head;
        if (head!=null) {
            head.prev = node;
        }
        head=node;
        head.prev=null;


        size++;



    }

    public void insertatend(int data)
    {
        node node =new node(data);
        node temp=head;
        if (head==null) {

            node.prev = null;
            node.next=null;
            head = node;
            return;
        }
        while (temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
    }

    public void display()
    {
        node temp=head;
        node last=null;
        while(temp!=null)
        {
            last=temp;
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("END");

        while (last!=null)
        {

            System.out.print (last.data+"-> ");
            last=last.prev;
        }
        System.out.println("START");
    }







}


public class circularll {
    public static void main(String[] args) {
        dll l=new dll();
        l.insertFirst(1);
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertatend(78);
        l.inserti(5,78);
        l.display();




    }
}
