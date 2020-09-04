package Stack;

public class MyStackLinkedList {
    public static void main(String[] args) {

        // Stack implemented with a doubly linked list is O(1) since there is no resizing needed and we only add
        // and remove items from the back; Custom methods added to behave like a stack;

        StackLinkedList stack = new StackLinkedList();

        stack.push(new Employee("Jane", "Jones", 122));
        stack.push(new Employee("Doug", "Jhonson", 288));
        stack.push(new Employee("Leo", "Noronha Santos", 2553));

        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek item is: " + stack.peek());
    }
}
