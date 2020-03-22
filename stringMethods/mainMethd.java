class mainMethod{
    public static void main(String[] args) {
        System.out.println();

        String array[] = {"funky" , "sky" , "fuck"};

        //startsWith
        for(String s : array){
            if(s.startsWith("fu")){
                System.out.println(s + " starts with fu");
            }
        }
        System.out.println();

        //endsWith
        for(String s : array){
            if(s.endsWith("ky")){
                System.out.println(s + " starts with fu");
            }
        }
        System.out.println();

        String x = "tharindutharindu";

        System.out.println(x.indexOf('a'));             //gives the index of first 'a'
        System.out.println(x.indexOf('a' , 5));         //gives the index of first 'a' but it ignores first 5 indexes
        System.out.println(x.indexOf("rin"));           //gives the index  of the first letter of the sub string witch find first
        System.out.println(x.indexOf("rin" , 8));       //gives the index  of the first letter of the sub string witch find first it ignores first 8 indexes
        System.out.println();

        String a = "Tharindu ";
        String b = "Hirantha";

        System.out.println(a + b);                      //concadination
        System.out.println(a.concat(b));                //concadination another way
        System.out.println(a.replace('i', 'a'));        //replace caracters
        System.out.println(a.toUpperCase());            //string goes to upper case


        String p = "                   hi                  ";

        System.out.println(p.trim());                   //this ignores spaces



    }
}