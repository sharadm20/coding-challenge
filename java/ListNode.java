//Linked List insertion sort
public class ListNode {
    int val;
    ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode merge(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode(0);
        ListNode ptr = temp;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                ptr.next = l1;
                l1 = l1.next;
                ptr = ptr.next;
            }else {
                ptr.next = l2;
                l2 = l2.next;
                ptr = ptr.next;
            }
        }
        ptr.next = (l1 != null) ? l1 : l2;

        return temp.next;
    }

    public ListNode getMiddle(ListNode head) {
        ListNode midPrev = null;

        while(head != null && head.next != null) {
            midPrev = midPrev == null ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = getMiddle(head);
        ListNode left = insertionSortList(head);
        ListNode right = insertionSortList(mid);

        return merge(left, right);
    }
}

