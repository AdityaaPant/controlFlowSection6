public class rightmost2 {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(21,22,31));
        System.out.println(isValid(21));
    }
        public static boolean hasSameLastDigit(int one , int two, int three){
        if((one>=10 && one<=1000)&&(two>=10 && two<=1000)&&( three>=10 && three<=1000)){
            int rightmostOne = one%10;
            int rightmostTwo = two%10;
            int rightmostThree = three%10;

            return (rightmostOne == rightmostTwo||
                    rightmostOne == rightmostThree||
                    rightmostThree == rightmostTwo);
        } return false;
        }
        public static boolean isValid(int four){
        if(four>=10 && four<=1000){
            return true;
        }return false;
        }
}
