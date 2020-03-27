import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        Character[] mArray = {'a' , 'y' , 'g' , 'm'};
        List<Character> L = Arrays.asList(mArray);
        System.out.printf("The main list: ");
        listPrint(L);

        Collections.reverse(L);
        System.out.printf("after reverse the list: ");
        listPrint(L);

        Character[] cArray = new Character[4];
        List<Character> copyList = Arrays.asList(cArray);
        Collections.copy(copyList, L);
        System.out.printf("this is the copied list: ");
        listPrint(copyList);

        Collections.fill(L, 'R');
        System.out.printf("after filling: ");
        listPrint(L);

    }

    private static void listPrint(List<Character> l) {
        for(Character a : l){
            System.out.printf("%s ", a);
        }
        System.out.println();
    }
}