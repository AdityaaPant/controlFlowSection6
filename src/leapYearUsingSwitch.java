public class leapYearUsingSwitch {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(getDaysInMonth(2, 2024));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            switch (0) {
                case 0:
                    if (year % 400 == 0) return true;
                    if (year % 100 == 0) return false;
                    if (year % 4 == 0) return true;

            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
if(year < 1 || year > 9999 || month < 1 || month > 12){
        return -1;
}

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2 :
                return isLeapYear(year)? 29 :28;
            default:
                return -1;

        }


    }
}