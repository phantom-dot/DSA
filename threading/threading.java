package threading;

//method 1 for multi threading in this we will extend thread class
class thread1 extends Thread
{
    @Override
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("thread 1 is running ");
            i++;
        }
    }
}
class thread2 extends Thread
{
    @Override
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("thread 2 is running ");
            i++;
        }
    }
}



//method 2 by implementing runnable interface
class runnablethread1 implements Runnable
{
    @Override
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("thread 1 is running ");
            i++;
        }
    }
}
class runnablethread2 implements Runnable
{
    @Override
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("thread 2 is running ");
            i++;
        }
    }
}






public class threading {
    public static void main(String[] args) {
   runnablethread1 t1=new runnablethread1();
   Thread t11=new Thread(t1);
   runnablethread2 t2=new runnablethread2();
   Thread t22=new Thread(t2);

    t11.start();
    t22.start();
    }
}

