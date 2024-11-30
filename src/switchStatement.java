public class switchStatement {
    public static void main(String[] args){
        checkForDay(12);
    }
    public static void checkForDay(int day) {
    switch (day){
        case 1 -> System.out.println("monday");
        case 2 -> System.out.println("tuesday");
        case 3 -> System.out.println("wednesday");
        case 4 -> System.out.println("thursday");
        case 5 -> System.out.println("friday");
        case 6 -> System.out.println("saturday");
        case 7 -> System.out.println("sunday");
        default -> System.out.println("enter a valid range between 1-7");
    }
//    switch (day){
//        case 1 :
//            System.out.println("monday");
//            break;
//        case 2:
//            System.out.println("tuesday");
//            break;
//        case 3:
//            System.out.println("wednesday");
//            break;
//        case 4:
//            System.out.println("thursday");
//            break;
//        case 5:
//            System.out.println("friday");
//            break;
//        case 6:
//            System.out.println("saturday");
//            break;
//        case 7:
//            System.out.println("sunday");
//            break;
//        default :
//            System.out.println("enter a valid number between 1-7");
//            break;
//    }
    }
}