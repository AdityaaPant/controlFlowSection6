public class firstNlast {
   public static void main( String[] args) {
       System.out.println("sum is" +sumFirstAndLastDigit(2));
       System.out.println("sum is" +sumFirstAndLastDigit(713));
       System.out.println("sum is" +sumFirstAndLastDigit(112));
   }

        public static int sumFirstAndLastDigit(int number) {
            if (number < 0) {
                return -1;
            }
            int lastNumber = number %10;
             int firstNumber = number;

            while(firstNumber >= 10){
                firstNumber /= 10;
            }
            return firstNumber + lastNumber;
        }
    }

