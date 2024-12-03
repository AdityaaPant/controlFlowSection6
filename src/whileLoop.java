public class whileLoop {
    public static void main(String[] args){
        int number = 4 ;
        int finishNumber = 20;
        int count = 0;
        int oddcount = 0;
        int evencount = 0;
        while( number <= finishNumber){
            number++;

            if(!isEvenNumber(number)){
                oddcount++;
                continue;
            }
            System.out.println("Even number " + number );
            evencount ++;


            if(count ==4){
                break;
            }else{
                count++;
            }
        }
        System.out.println("number of odd numbers is " + oddcount);
        System.out.println("number of even numbers is " + evencount);
        System.out.println("number count is "+ count);


    }
    public static boolean isEvenNumber(int number){
            if(number %2 ==0){
                return true;
            } else {
                return false;
            }
        }
    }

