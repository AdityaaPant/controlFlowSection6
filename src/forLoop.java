public class forLoop {
    public static void main(String[] args){
        for(int i =1; i <5 ; i++){
            System.out.println(i);
        }
        System.out.println("10,000 at 2% interest is " + returnValue(2, 10000));
    }
    public static double returnValue(double interest, double amount){
        return ( amount*(interest/100));
    }
}
