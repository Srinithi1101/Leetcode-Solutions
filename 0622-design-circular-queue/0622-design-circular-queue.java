class MyCircularQueue {
    int[]q;
    int front=0,rear=0,count=0,k;

    public MyCircularQueue(int k) {
        this.k=k;
        q=new int[k];
        
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        q[rear]=value;
        rear=(rear+1)%k;
        count++;
        return true;
        
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        front=(front+1)%k;
        count--;
        return true;
        
    }
    
    public int Front() {
        return isEmpty()?-1:q[front];
    }
    
    public int Rear() {
        return isEmpty()?-1:q[(rear-1+k)%k];
        
    }
    
    public boolean isEmpty() {
        return count==0;
        
    }
    
    public boolean isFull() {
        return count==k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */