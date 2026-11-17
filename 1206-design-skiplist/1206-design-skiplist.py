class Node:
    def __init__(self, val, level):
        self.val = val
        self.forward = [None]*level
class Skiplist:

    def __init__(self):
        self.head=Node(-1,16)
        self.count=0
        

    def search(self, target: int) -> bool:
        current=self.head
        for i in range(15,-1,-1):
            while current.forward[i] and current.forward[i].val < target:
                current = current.forward[i]

        current = current.forward[0]
        if current and current.val == target:
            return True

        return False 
        

    def add(self, num: int) -> None:
        update = [None] * 16
        current = self.head

        for i in range(15, -1, -1):
            while current.forward[i] and current.forward[i].val < num:
                current = current.forward[i]
            update[i] = current

        self.count += 1

        level = 1
        n = self.count

        while n % 2 == 0 and level < 16:
            level += 1
            n = n // 2

        new_node = Node(num, level)

        for i in range(level):
            new_node.forward[i] = update[i].forward[i]
            update[i].forward[i] = new_node

    def erase(self, num: int) -> bool:
        update = [None] * 16
        current = self.head

        for i in range(15, -1, -1):
            while current.forward[i] and current.forward[i].val < num:
                current = current.forward[i]

            update[i] = current

        current = current.forward[0]

        if current is None or current.val != num:
            return False

        for i in range(len(current.forward)):
            update[i].forward[i] = current.forward[i]

        return True
        


# Your Skiplist object will be instantiated and called as such:
# obj = Skiplist()
# param_1 = obj.search(target)
# obj.add(num)
# param_3 = obj.erase(num)