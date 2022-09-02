package queue;

public class customQ {


     int[]Q;
     int end=-1;
     private static final int DEFAULT_SIZE=10;

     public customQ(int size)
     {
          this.Q=new int [size];
     }

     public customQ()
     {
          this(DEFAULT_SIZE);
     }

     public boolean isFull()
     {
          return end==Q.length-1;
     }
     public boolean isEmpty()
     {
          return end==-1;
     }

     public boolean insert(int data)
     {
          if (isFull())
               return false;
          Q[++end]=data;
          return true;
     }

     public int delete()
     {
          if (isEmpty())
               System.out.println("Q IS ALREADY EMPTY");
          int removed=Q[0];
          System.arraycopy(Q, 1, Q, 0, Q.length - 1);
          end--;
          return removed;
     }

     public int  front() throws Exception {

          if (isEmpty())
          {
               throw new Exception("q is empty");
          }

          return Q[0];




     }
     public void display()
     {
          for (int j : Q) {
               System.out.println(j + " ");
          }
          System.out.println("END");
     }
}
