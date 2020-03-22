class mainMethod{
    public static void main(String[] args) {
        System.out.println(factorial(5));;
    }
    
    static long factorial(long x){
        if(x <= 1){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }
}