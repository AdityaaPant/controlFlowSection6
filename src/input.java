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

            boolean validDOB= false;
            int age =0;

            do {
                System.out.println("Enter a year of birth >= "+ (currentYear -125)+ " and <= " + (currentYear));
               try{
                   age = checkData(currentYear , scanner.nextLine());
                   validDOB =age < 0 ? false:true;
               }catch(NumberFormatException badUserData){
                   System.out.println("Characters not allowed!! try again..");jj
               }

            }while(!validDOB);
            return "so you are " + age + " years old";

        }
    public static int checkData(int currentYear , String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
    int minimumYear = currentYear-125;
    if((dob<minimumYear)|| (dob >currentYear )){
        return -1;
    }
    return (currentYear-dob);
    }

}
