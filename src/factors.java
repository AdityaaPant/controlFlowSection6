public class factors {
    public static void main(String[] args){
        System.out.println(printFactors(200));
    }
    public static String printFactors(int number){
        if (number <1){
            System.out.println("Invalid Value");
        }
        for(int i= 1; i<=number ; i++){
            if(number % i == 0){
                System.out.print(i+" ");
            };
        }


        return "";
    }
}
