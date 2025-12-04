// LeetCode 141: linked-list-cycle

fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head?.next

    while(slow != null && fast != null) {
        if(slow == fast) {
            return true
        }

        slow = slow?.next
        fast = fast?.next?.next
    }

    return false
}