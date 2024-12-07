public class largestprime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(23));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int factor = -1;
        if (number > 10) {
            for (int i = 2; i * i <= number; i++) {
                if (number % i != 0) {
                    continue;
                }
                factor = i;
                while (number % i == 0) {
                    number /= i;

                }
            }

        }return number == 1 ? factor : number;
    }
}
