public class switchChallenge {
    public static void main(String[] args){
        nameNato('E');
    }
    public static void nameNato ( char nato){

        switch (nato) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("enter a valid range A-E");

//            case 'A' -> System.out.println("Able");
//            case 'B' -> System.out.println("baker");
//            case 'C' -> System.out.println("Charlie");
//            case 'D' -> System.out.println("Dog");
//            case 'E' ->System.out.println("Easy");
//            default -> {
//             String badResponse = nato + "is bad ";
//               yield badResponse;
//            }

        }
    }
}
