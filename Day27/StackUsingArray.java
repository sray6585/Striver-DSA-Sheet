
public class Stack {
    int arr[];
    int top;
    int size;
    Stack(int n)
    {
        arr=new int[n];
        top=-1;
        size=n;
    }
    
    void push(int num) {
        // Write your code here.
        arr[++top]=num;
    }
    int pop() {
        // Write your code here.
        if(top==-1)
            return -1;
        int val=arr[top];
        arr[top--]=0;
        return val;
    }
    int top() {
        // Write your code here.
        if(top==-1)
            return -1;
        return arr[top];
    }
    int isEmpty() {
        // Write your code here.
        return top==-1?1:0;
    }
    int isFull() {
        // Write your code here.
        return top==size?1:0;
    }
}
