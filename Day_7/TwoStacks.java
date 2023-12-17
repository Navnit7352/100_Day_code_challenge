/*
Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.
push1 : pushes element into first stack.
push2 : pushes element into second stack.
pop1 : pops element from first stack and returns the popped element. If first stack is empty, it should return -1.
pop2 : pops element from second stack and returns the popped element. If second stack is empty, it should return -1.

Example 1:
        Input:
        push1(2)
        push1(3)
        push2(4)
        pop1()
        pop2()
        pop2()
        Output:
        3 4 -1
        Explanation:
        push1(2) the stack1 will be {2}
        push1(3) the stack1 will be {2,3}
        push2(4) the stack2 will be {4}
        pop1()   the poped element will be 3 from stack1 and stack1 will be {2}
        pop2()   the poped element will be 4 from stack2 and now stack2 is empty
        pop2()   the stack2 is now empty hence returned -1.
        
Example 2:
        Input:
        push1(1)
        push2(2)
        pop1()
        push1(3)
        pop1()
        pop1()
        Output:
        1 3 -1
        Explanation:
        push1(1) the stack1 will be {1}
        push2(2) the stack2 will be {2}
        pop1()   the poped element will be 1 from stack1 and stack1 will be empty
        push1(3) the stack1 will be {3}
        pop1()   the poped element will be 3 from stack1 and stack1 will be empty
        pop1()   the stack1 is now empty hence returned -1.
*/

//Code
class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    //Function to push value in stack1
    void push1(int x)
    {
        arr[++top1] = x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        arr[--top2] = x;
    }
    //Function to remove an element from top of the stack1.
    int pop1() {
        return top1 == -1 ? -1 : arr[top1--];
    }

    //Function to remove an element from top of the stack2.
    int pop2() {
        return top2 == 100 ? -1 : arr[top2++];
    }
}
//Time Complexity = O(1)
