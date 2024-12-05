public class digitsSum {
    public static void main(String[] args){
        System.out.println("the sum of digits in the number is " + sumDigits(2112) );
    }
    public static int sumDigits(int number){
        if  (number < 0 ){
            return -1;
        }
        int sum =0;
        while (number > 9){
            sum += (number %10 ) ;
            number = number /10;
        }
        sum += number;
        return sum;
    }
}
