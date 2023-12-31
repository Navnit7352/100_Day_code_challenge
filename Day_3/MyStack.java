/*
Write a program to implement a Stack using Array. Your task is to use the class as shown in the comments in the code editor and complete the
functions push() and pop() to implement a stack. 

Example 1:
        Input: 
        push(2)
        push(3)
        pop()
        push(4) 
        pop()
        Output: 3, 4
        Explanation: 
        push(2)    the stack will be {2}
        push(3)    the stack will be {2 3}
        pop()      poped element will be 3,
                   the stack will be {2}
        push(4)    the stack will be {2 4}
        pop()      poped element will be 4
        
Example 2:
        Input: 
        pop()
        push(4)
        push(5)
        pop()
        Output: -1, 5
*/

//Code
class MyStack
{
    int top;
    //size of stack is 1000
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push data into stack
    void push(int a)
	{
	    top++;
	    arr[top]=a;
	} 
	
    //Function to pop data from stack
	int pop()
	{
        if(top==-1){
            return -1;
        }
        return arr[top--];
	}
}

//Time complexity = O(1).
