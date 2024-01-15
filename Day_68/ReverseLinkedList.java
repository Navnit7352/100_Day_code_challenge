/*
Given a singly linked list, sort the list (in ascending order) using insertion sort algorithm.

Example 1:

Input:
N = 10
Linked List = 30->23->28->30->11->14->
              19->16->21->25 
Output : 
11 14 16 19 21 23 25 28 30 30 
Explanation :
The resultant linked list is sorted.
Example 2:

Input : 
N = 7
Linked List=19->20->16->24->12->29->30 
Output : 
12 16 19 20 24 29 30 
Explanation : 
The resultant linked list is sorted.
*/

//Code
class Solution
{
    public static Node insertionSort(Node head_ref)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        Node temp = head_ref;
        
        while(temp!=null){
            array.add(temp.data);
            temp = temp.next;
        }
        
        Collections.sort(array);
        
        Node temp2 = head_ref;
        while(temp2!=null){
            for(int i=0;i<array.size();i++){
                temp2.data = array.get(i);
                temp2 = temp2.next;
            }
        }
        
        return head_ref;
    }
}
