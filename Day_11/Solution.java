public static Node reverseDLL(Node  head)
{
    Node temp = head;
    
    while (temp.next!=null) {
        Node t = temp.prev;
        temp.prev = temp.next;
        temp.next = t;
        temp = temp.prev;
    }
    Node t = temp.prev;
    temp.prev = temp.next;
    temp.next = t;
    head = temp;
    
    return head;
}
