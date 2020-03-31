import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        String[] names = {"tharindu" , "hirantha" ,"bandara" , "ayagama" , "tharindu" , "tharindu"};
        List<String> nameList = Arrays.asList(names);

        System.out.printf("%s " , nameList);
        System.out.println();

        //hash set removee dublicate value
        Set<String> nameSet = new HashSet<String>(nameList);
        System.out.printf("%s " , nameSet);
    }
}