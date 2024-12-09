public class parsingValues {
    public static void main(String[] args){
        int currentYear =2022;
        String userDateOfBirth ="1999";
        int dateOfBirth = Integer.parseInt(userDateOfBirth);
        System.out.println("Age ="+ (currentYear - dateOfBirth));
        String usersAgeWithPartialYear= "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("the users says he is "+ ageWithPartialYear);
    }
}
