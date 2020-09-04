package Stack;

import java.util.EmptyStackException;

public class StackArray {

    private Employee[] stack;
    private int top;

    public StackArray(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {

        // Worse case for stack made with an array is O(n) for having to resize
        // and copy the old array into the new one
        if (top == stack.length) {
            // resize array
            Employee[] newArray = new Employee[2 * stack.length];
            // Copy array into new array
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            // Assign new array to stack
            stack = newArray;
        }

        // If no resize is need push is O(1)
        stack[top++] = employee;
    }

    public Employee pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        // Make top the index of the previous item
        Employee employee = stack[--top];
        // Set top to null to delete the top most item
        stack[top] = null;

        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
