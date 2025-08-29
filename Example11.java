import java.util.NoSuchElementException;

public class Example11 {
    private double[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public Example11(int capacity) {
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enqeue(double transactionAmount) {
        if (size == capacity) {
            // Queue is full, handle overflow (e.g., rezize or throw an exception)
            throw new RuntimeException("Queue is full.");
        }
        rear = (rear + 1) % capacity;
        size++;
    }

    public double dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        double transactionAmount = queue[front];
        front = (front + 1) % capacity;
        size--;
        return transactionAmount;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Example11 transactionQueue = new Example11(10);

        // Simulate bank transactions (dequeue into the queue)
        transactionQueue.enqeue(100.0);
        transactionQueue.enqeue(-50.0);
        transactionQueue.enqeue(200.0);

        // Process transactions (dequeue ffrom the queue)
        while (!transactionQueue.isEmpty()) {
            double transactionAmount = transactionQueue.dequeue();
            // Process the transaction (e.g., update account balance)
            System.out.println("Transaction: " + transactionAmount);
        }
    }
    
}
