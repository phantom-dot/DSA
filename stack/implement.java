package stack;

import java.util.Stack;





class Mystack{
    int[] stack;
    int top=-1;
    private static final int DEFAULT_SIZE=10;

    public Mystack(int capacity)
    {
        this.stack=new int[capacity];
    }

    public Mystack()
    {
        this(DEFAULT_SIZE);
    }

    boolean isFull()
    {
        return top== stack.length-1;
    }
    boolean isEmpty()
    {
        return top == -1;
    }
    boolean push (int data)  {

        if (isFull())
        {
            System.out.println("Overflow");
            return false;
        }

        top++;
        stack[top]=data;
        return true;
    }
    public int pop() {
        if(isEmpty())
        {
            System.out.println("underflow");
        }

        return stack[top--];

    }

    int peek(){
        if (isEmpty()){
            System.out.println("no elem at top");
        }

        return stack[top];


    }




}


class dynamicstack extends Mystack{

    public dynamicstack() {
        super();
    }
    public dynamicstack(int size)
    {
        super(size);
    }

    @Override
    boolean push(int data) {
        if (isFull())
        {
            int[] newstack= new int[stack.length*2];
            System.arraycopy(stack,0,newstack,0,stack.length);
            stack=newstack;
        }

        return super.push(data);

    }
}

public class implement {
    public static void main(String[] args){


        dynamicstack stack=new dynamicstack(1);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());



        /*

              Stack<Integer> stack= new Stack<Integer>();
              stack.push(1);
              stack.push(2);
              stack.push(3);
              stack.push(4);
              stack.push(5);
        */
    }
}
