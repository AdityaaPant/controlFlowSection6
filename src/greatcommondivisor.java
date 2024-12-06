public class greatcommondivisor {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(32, 20));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second <10){
            return -1;
        }

        int i;
        int gcd =1;
        for(i=1; i<=first && i<=second; i++){
            if (first % i == 0 && second % i == 0) {
                gcd =i;
            }
        }
        return gcd;
}
}
