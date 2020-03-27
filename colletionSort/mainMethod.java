import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        String[] A = {"lap" , "phone" , "charger" , "pilolow"};
        List<String> L = Arrays.asList(A);

        Collections.sort(L);
        System.out.printf("%s\n" , L);

        Collections.sort(L , Collections.reverseOrder());
        System.out.printf("%s" , L);
    }
}