package queue;

public class MAINQ {
    public static void main(String[] args) {
        customQ q=new customQ(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);

        q.display();
    }
}
