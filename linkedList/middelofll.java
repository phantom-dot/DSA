package linkedList;

public class middelofll {

    public static ll.node middle(ll.node head)
    {
        ll.node slow=head;
        ll.node fast=head;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ll l=new ll();
        l.insert(6);
        l.insert(5);
        l.insert(4);
        l.insert(3);
        l.insert(2);
        l.insert(1);

        System.out.println(middle(l.head).data);

    }
}
