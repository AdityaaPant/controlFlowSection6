public class NumberPalindrome {
    public static void main(String[] args){
            System.out.println("the number having the palindrome is" + isPalindrome(212));
    }
    public static boolean isPalindrome(int number){
          int reverse=0;
          int lastDigit=0;
          if(reverse == number){
              while(number>=0){
                  lastDigit = number % 10;
                  lastDigit = reverse*10;

              }
          }
              return false;


    }
}
