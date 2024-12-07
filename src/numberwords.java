public class numberwords {
    public static void main(String[] args) {
        System.out.println(numberToWords(89));
        System.out.println(numberToWords(23222));
        System.out.println(numberToWords(8));
        System.out.println(numberToWords(0));

    }

    public static String numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
                default -> System.out.print("enter a valid value");
            }
            reversedNumber /= 10;

        }
        for (int i = 0; i < (originalDigitCount - reversedDigitCount); i++) {
            System.out.println("Zero");
        }
        return "";
    }

    public static int reverse(int number) {
        int reversed = 0;
        int isNegetive = number < 0 ? -1 : 1;
        number = Math.abs(number);
        while (number > 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }
        return reversed * isNegetive;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
