class ListNode {
    int val;
    ListNode next;
    
    ListNode() {};
    
    ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    
    // Method to reverse a custom LinkedList using ListNode
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode next = curr.next;  // Save next node
            curr.next = prev;           // Reverse the link
            prev = curr;                // Move prev forward
            curr = next;                // Move curr forward
        }
        return prev;  // New head of reversed list
    }
    
    // Helper method to print ListNode
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
    
    // Helper method to create ListNode from array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;
        
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        // Create custom linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = createList(new int[]{1, 2, 3, 4, 5, 6});
        
        System.out.print("Original: ");
        printList(head);
        
        ListNode reversed = reverse(head);
        
        System.out.print("Reversed: ");
        printList(reversed);
    }
}