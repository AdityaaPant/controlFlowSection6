import java.util.Scanner;

public class input {
    public static void main(String[] args){
        int currentYear =2024;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch(NullPointerException e) {
            System.out.println(getInputFromConsole(currentYear));
        }
    }

        public static String getInputFromConsole( int currentYear){
            Scanner scanner = new Scanner(System.in);

            System.out.println("hi, what's your name");
            String name = scanner.nextLine();

            System.out.println("hi " + name + " thanks for coding");

            System.out.println("what year you were born ");
            String dateOfBirth= scanner.nextLine();
            int age = currentYear - Integer.parseInt(dateOfBirth);

            return "so you are " + age + " years old";

        }
    public static int checkData(int currentYear , String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth)
;
    int minimumYear}

}
