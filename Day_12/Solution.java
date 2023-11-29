class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node result = null;
        Node tail = null;

        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                // Found an intersection, add to the result list
                if (result == null) {
                    result = new Node(head1.data);
                    tail = result;
                } else {
                    tail.next = new Node(head1.data);
                    tail = tail.next;
                }
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.data < head2.data) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }
        return result;
    }
}