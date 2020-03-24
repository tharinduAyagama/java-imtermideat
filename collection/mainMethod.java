import java.util.*;


class mainMethod{
    public static void main(String[] args) {
        String[] mainArray = {"amal" , "kamal" , "nimal" , "amara"};
        List<String> mainList = new ArrayList<String>();
        for(String x : mainArray){
            mainList.add(x);
        }

        String[] shouldDeleteArray = {"amal" , "kamal"};
        List<String> shouldDeleteList = new ArrayList<String>();
        for(String y : shouldDeleteList){
            shouldDeleteList.add(y);
        }


        for(String a : mainList){
            System.out.printf("%s " , a);
        }
        System.out.println();

        listEditing(mainList , shouldDeleteList);

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