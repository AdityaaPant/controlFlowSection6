public class oddCheck {
    public static void main(String[] args){
        System.out.println(" the number is "+ isOdd(22));
        System.out.println(" the number is"+ sumOdd(11,  21));
    }
    public static boolean isOdd(int number){
        if (number <= 0){
            return false;
            }

        return number % 2 !=0;
    }
    public static int sumOdd(int start , int end){
    if(start > end || start <=0 || end <=0){
        return -1;
    }
            int sum = 0;
        for(int i = start; i <= end ; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
            return sum;
    }
}

