public class Example9 {
    private double[] stack;
    private int top;

    public Example9(int capacity) {
        stack = new double[capacity];
        top = -1;
    }

    publicvoid push(double transactionAmount) {
        if(top == stack.length - 1) {
            // Stack is ful, handle overview (e.g., resize or throw an exception)
            throw new RuntimeException("Stack is full.");
        }
        stack[++top] = transactionAmount;
    }

    public double pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1
    }

    public static void main(String[] args) {
        Example9 transactionStack = new Example9(10);

        // Simulate bank transactions (pushing onto the stack)
        transactionAmount.push(100.0);
        transactionAmount.push(-50.0);
        transactionAmount.push(200.0);

        // Process transactions (pop from the stack)
        while(!transactionAmount.isEmpty()) {
            double transactionAmount = transactionStack.pop();
            // Process the transaction (e.g., update account balance)
            System.out.println("Transaction: " + transactionAmount);
        }
    }
}
