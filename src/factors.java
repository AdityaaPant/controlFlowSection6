public class factors {
    public static void main(String[] args){
        System.out.println(printFactors(28));
    }
    public static boolean printFactors(int number){
        int sum =0;
        if (number <1){
            System.out.println("Invalid Value");
        }
        for(int i= 1; i<=number ; i++){
            if(number % i == 0){
                System.out.print(i+" ");


                sum+=i;

            }
        }


        return sum==number;
    }
}
