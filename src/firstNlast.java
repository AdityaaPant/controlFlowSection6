public class firstNlast {
   public static void main( String[] args) {
       System.out.println("sum is" +sumFirstAndLastDigit(212));
       System.out.println("sum is" +sumFirstAndLastDigit(713));
       System.out.println("sum is" +sumFirstAndLastDigit(112));
   }

        public static int sumFirstAndLastDigit(int number) {
            if (number < 0) {
                return -1;
            }
             int firstNumber = number;
            int lastNumber = number %10;
            while(firstNumber >9){
                firstNumber /= 10;
            }
            return firstNumber + lastNumber;
        }
    }

