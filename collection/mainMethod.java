import java.util.*;


class mainMethod{
    public static void main(String[] args) {
        String[] mainArray = {"amal" , "kamal" , "nimal" , "amara"};
        List<String> mainList = new ArrayList<String>();
        for(String x : mainArray){
            mainList.add(x);
        }

        String[] deleteArray = {"amal" , "kamal"};
        List<String> deleteList = new ArrayList<String>();
        for(String y : deleteArray){
            deleteList.add(y);
        }


        for(String a : mainList){
            System.out.printf("%s " , a);
        }
        System.out.println();

        listEditing(mainList , deleteList);

        for(String a : mainList){
            System.out.printf("%s " , a);
        }

    }

    public static void listEditing(Collection<String> a , Collection<String> b){
        Iterator<String> items = a.iterator();
        while(items.hasNext()){
            if(b.contains(items.next())){
                items.remove();
            }
        }
    }
}