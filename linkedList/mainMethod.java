import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        String[] instuments = {"ball" , "bat" , "racket" , "disk" , "coins"};
        List<String> instumentsList = new LinkedList<>();
        for(String x : instuments){
            instumentsList.add(x);
        }

        String[] hasToAdd = {"netball" , "bord"};
        List<String> hasToAddList = new LinkedList<>();
        for(String x : hasToAdd){
            hasToAddList.add(x);
        }

        //add all items in hasToAddList to instumentsList
        instumentsList.addAll(hasToAddList);

        printList(instumentsList);
        removeItemes(instumentsList , 0 , 1);
        printList(instumentsList);
        reverseList(instumentsList);
    }

    private static void printList(List<String> l){
        for(String x : l){
            System.out.printf("%s " , x);
        }
        System.out.println();
        System.out.println();
    }

    private static void removeItemes(List<String> l , int x , int y){
        //this sublist and clear buildin methods can use for linkedlist
        l.subList(x,y).clear();
    }

    private static void reverseList(List<String> l){
        ListIterator<String> items = l.listIterator(l.size());
        while(items.hasPrevious()){
            System.out.printf("%s " , items.previous());
        }
    }
}