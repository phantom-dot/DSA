package linkedList;

public class kth_node_fromend {


    public static ll.node delkthfromend(ll.node head,int k)
    {
        ll.node temp=head;
        int l=0;
        while (temp!=null)
        {
                temp=temp.next;
                l++;
        }
        if (l<=2 && k==1)
        {
            head.next=null;
            temp=head;
        }
        if (l==1&&k==1)
        {
            head=null;
            temp=head;
        }
        else if ((l<=2 && k==2)||k-l==0)
        {
            temp=head.next; // 1 2
        }
        //1 2 3 4 5 6
       else{ temp=head;
        int i=0;
        while (i!=l-k-1)
        {

            temp=temp.next;
            i++;
        }

        temp.next=temp.next.next;
        temp=head;}

        return temp;
    }

    public static ll.node findkthnodeend(ll.node head,int k)
    {
        //MR JAGGI'S TWO POINTER APPROACH
        ll.node main=head;
        ll.node ref=head;


        for (int i = 1; i <=k ;i++) {
            ref=ref.next;
        }
        while (ref!=null)
        {
            ref=ref.next;
            main=main.next;
        }
        return main;
    }


    public static void print(ll.node head)
    {ll.node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }







    public static  ll.node findkthnode(ll.node head,int k)
    {
        //BRUTEFORCE APPROACH
        ll.node temp=head;

        int len=0;
        while (temp!=null)
        {
            temp=temp.next;
            len++;
        }

        temp=head;
        int i=0;
        while(i!=len-k)
        {
        temp=temp.next;
        i++;
        }

        return temp;
    }

    public static void main(String[] args) {
        ll l=new ll();


       l.insert(1);
       // 1->2->3->4->5->6->7->null

        ll.node node =delkthfromend(l.head,1);
        print(node);
    }
}
