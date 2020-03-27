import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        String[] A = {"lap" , "phone" , "charger" , "pilolow"};
        LinkedList<String> L = new LinkedList<>(Arrays.asList(A));      //converting array to list
        
        L.add(2, "cable");
        L.addFirst("sheet");
        
        A = L.toArray(new String[L.size()]);                            //converting list to array

        for(String x : A){
            System.out.printf("%s " , x);
        }
    }
}