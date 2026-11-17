class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

class MyLinkedList:

    def __init__(self):
        self.head=None
        

    def get(self, index: int) -> int:
        cur = self.head
        for _ in range(index):
            if not cur: return -1
            cur = cur.next
        return cur.val if cur else -1
       

    def addAtHead(self, val: int) -> None:
        n = Node(val)
        n.next = self.head
        self.head = n

        

    def addAtTail(self, val: int) -> None:
        n = Node(val)
        if not self.head:
            self.head = n
            return
        cur = self.head
        while cur.next:
            cur = cur.next
        cur.next = n
        

    def addAtIndex(self, index: int, val: int) -> None:
        if index == 0:
            self.addAtHead(val)
            return
        cur = self.head
        for _ in range(index - 1):
            if not cur: return
            cur = cur.next
        if not cur: return
        n = Node(val)
        n.next = cur.next
        cur.next = n

        

    def deleteAtIndex(self, index: int) -> None:
        if index == 0:
            if self.head: self.head = self.head.next
            return
        cur = self.head
        for _ in range(index - 1):
            if not cur: return
            cur = cur.next
        if cur and cur.next:
            cur.next = cur.next.next

        


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)