public class shared {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(12 , 23));
    }
    public static boolean hasSharedDigit(int one,int two){
        if((one >= 10 && one <=99) && (two >= 10 && two <=99)){
            int firstNumberOne = one/10;
            int lastNumberOne = one %10 ;

                int firstNumberTwo = two/10;
                int lastNumberTwo = two % 10;

            return
                    (firstNumberOne==firstNumberTwo||
                    firstNumberOne==lastNumberTwo||
                    lastNumberOne==firstNumberTwo||
                    lastNumberOne==lastNumberTwo);

        }
        return false;
    }
}
