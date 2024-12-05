public class NumberPalindrome {
    public static void main(String[] args){
            System.out.println("the number having the palindrome is" + isPalindrome(212));
            System.out.println("the number having the palindrome is" + isPalindrome(21222));
            System.out.println("the number having the palindrome is" + isPalindrome(2112));
    }

        public static boolean isPalindrome(int number) {
            int originalNumber = number;
            int reverse = 0;
            while (number != 0) {
                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number /= 10;
            }
            return originalNumber == reverse;
        }

}
