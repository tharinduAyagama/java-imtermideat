import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        Integer[] I = {1,2,2,3,};
        Character[] C = {'a' , 's' , 'd' , 'f'};
        String[] S = {"cat" , "dog" , "cow" , "ant"};

        printArray(I);
        printArray(C);
        printArray(S);
    }

    //generic method
    //we dont want to write overload methods insted of that we can write a generic method like this
    private static <T> void printArray(T[] x) {
        for(T a : x){
            System.out.printf("%s " , a);
        }
        System.out.println();
    }
}