package Stack;

public class MyStackArray {
    public static void main(String[] args) {

        // Stack implemented with an array is perfect if you know how many items you need, otherwise it will be O(n)
        // because you will have to resize the array then copy over the items to the new array to be able to add
        // more items. Besides that, it is O(1) because you only add and remove items from the top of the stack

        StackArray stack = new StackArray(4);

        stack.push(new Employee("Jane", "Jones", 122));
        stack.push(new Employee("Doug", "Jhonson", 288));
        stack.push(new Employee("Leo", "Noronha Santos", 2553));

        stack.printStack();

        System.out.println("First item added to the stack: \n" + stack.peek());

        System.out.println("Popped item is:\n" + stack.pop());

        stack.printStack();

    }
}
