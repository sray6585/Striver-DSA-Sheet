import java.util.*;
public class Stack {

    // Define the data members.
    Queue<Integer> q1;

    public Stack() {
        // Implement the Constructor.
        q1=new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q1.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        q1.offer(element);
        for(int i=0;i<q1.size()-1;i++)
            q1.offer(q1.poll());
    }

    public int pop() {
        // Implement the pop() function.
        if(q1.isEmpty())
            return -1;
        return q1.poll();
    }

    public int top() {
        // Implement the top() function.
        if(q1.isEmpty())
            return -1;
        return q1.peek();
    }
}