public class forLoop {
    public static void main(String[] args){
        for(int i =1; i <5 ; i++){
            System.out.println(i);
        }
        for(double rate = 2.0 ; rate <= 5 ; rate++){
            double interestAmount = returnValue(rate, 10000);
        System.out.println("10,000 at "+ rate +" interest is " + interestAmount);
        }
    }
    public static double returnValue(double interest, double amount){
        return ( amount*(interest/100));
    }
}
