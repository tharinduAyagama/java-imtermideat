import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        String[] mArray = {"choco" , "biscuit" , "bun" , "cake"};
        List<String> list1 = Arrays.asList(mArray);

        String[] sArray = {"door" , "bed" , "chair" , "table"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(sArray));

        for(String x : list2){
            System.out.printf("%s " , x);
        }
        System.out.println();

        //adding mArray elements to list2
        Collections.addAll(list2 , mArray);

        for(String x : list2){
            System.out.printf("%s " , x);
        }

        System.out.println();
        //frequency of "bun" in list2
        System.out.println(Collections.frequency(list2, "bun"));

        //if there is somthing commen it returns false
        Boolean T = Collections.disjoint(list1, list2);

        if(T){
            System.out.println("there is not commen things");
        }
        else{
            System.out.println("there is somthing commen");
        }
    }
}