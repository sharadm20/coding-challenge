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
    /*
    The below shuffleList method does uniform shuffling of LinkedList,
    The approach is to find the half of linked-list and the appending them one each after each
    append they are role-reversed as done in interleave method.
     */
    void shuffleList(ListNode head){
         if(head == null) return;
         ListNode half = splitAtHalf(head);
         interleave(head, half);
         head = half;
    }
    private ListNode splitAtHalf(ListNode head) {
        ListNode twiceFast = head;
        while(twiceFast.next.next != null){
            twiceFast = twiceFast.next.next;
            head = head.next;
        }
        ListNode result = head.next;
        head.next = null;
        return result;
    }

    private void interleave(ListNode first, ListNode second) {
         ListNode tail = null;
         recInterleave(first, second, tail);
    }

    private ListNode recInterleave(ListNode first, ListNode second, ListNode tail) {
         if(second == null) return null;
         if(tail == null) tail = second;
         else {
             tail.next = second;
             tail = second;
         }
         second.next = recInterleave(second.next, first, tail);
         return second;
    }


}

