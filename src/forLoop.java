public class forLoop {

    public static void main(String[] args){
        for( double interestRate= 7.5; interestRate<=10; interestRate+=0.25 ){
            double intAmount = returnValue(interestRate, 100);
            System.out.println("$100 at " + interestRate +" interest is " +intAmount);
        }
    }
//    public static void main(String[] args){
//        for(double rate = 2.0 ; rate <= 5 ; rate++){
//            double interestAmount = returnValue(rate, 10000);
//            System.out.println("10,000 at "+ rate +" interest is " + interestAmount);
//        }
//    }
    public static double returnValue(double interest, double amount){
        return ( amount*(interest/100));
    }
}
