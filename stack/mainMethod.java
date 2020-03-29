import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        Stack<String> things = new Stack<>();

        things.push("mango");
        printStack(things);
        things.push("orange");
        printStack(things);
        things.push("banana");
        printStack(things);
        things.push("melon");
        printStack(things);

        things.pop();
        printStack(things);
        things.pop();
        printStack(things);
        things.pop();
        printStack(things);
        things.pop();
        printStack(things);

    }

    private static void printStack(Stack s){
        if(s.isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            System.out.printf("%s TOP\n" , s);
        }
    }
}