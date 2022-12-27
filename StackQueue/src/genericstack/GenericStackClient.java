package genericstack;

public class GenericStackClient {
    private static void stackOfStrings(){
        MyGenericStack<String> stringStack = new MyGenericStack<>();
        stringStack.push("BMW");
        stringStack.push("Mazda");
        stringStack.push("Bentley");
        System.out.println("size of stack after push: " + stringStack.size());
        System.out.println("2.1. Size of stack after push operations: " + stringStack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stringStack.isEmpty()) {
            System.out.printf(" %s", stringStack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stringStack.size());
    }
    private static void stackOfintegers(){
        MyGenericStack<Integer> integerStack = new MyGenericStack<>();
        integerStack.push(99);
        integerStack.push(10);
        integerStack.push(34);
        integerStack.push(11);
        integerStack.push(123);
        System.out.println("size of stack after push: " + integerStack.size());
        System.out.println("2.1. Size of stack after push operations: " + integerStack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!integerStack.isEmpty()) {
            System.out.printf(" %d", integerStack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + integerStack.size());
    }
    public static void main(String[] args) {
        stackOfStrings();
        System.out.println("--------------------");
        stackOfintegers();
    }
}
