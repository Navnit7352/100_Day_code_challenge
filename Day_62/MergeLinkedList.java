/*
Given two linked lists of size N and M, which are sorted in non-decreasing order. The task is to merge them in such a way that the resulting list is in non-increasing order.

Example 1:

Input:
N = 2, M = 2
list1 = 1->3
list2 = 2->4
Output:
4->3->2->1
Explanation:
After merging the two lists in non-increasing order, we have new lists as 4->3->2->1.
Example 2:

Input:
N = 4, M = 3
list1 = 5->10->15->40 
list2 = 2->3->20
Output:
40->20->15->10->5->3->2
Explanation:
After merging the two lists in non-increasing order, we have new lists as 40->20->15->10->5->3->2.
*/

//Code

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	      Node ptr=null,temp=null;
    while(node1 != null && node2 != null){
        if(node1.data < node2.data){
            temp = node1;
            node1 = node1.next;
        }
        else{
            temp = node2;
            node2 = node2.next;
        }
        temp.next = ptr;
            ptr = temp;
    }
    while(node1 != null){
        temp = node1;
        node1 = node1.next;
        temp.next = ptr;
        ptr = temp;
    }
    while(node2 != null){
        temp = node2;
        node2 = node2.next;
        temp.next = ptr;
        ptr = temp;
    }
    return ptr;
    }
}
