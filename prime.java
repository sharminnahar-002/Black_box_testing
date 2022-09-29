import java.util.Scanner;

public class prime {
   
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check if it is truly prime number or not: ");
            int number= sc.nextInt();
            if(isPrime(number)) {
                System.out.println(number + " is prime number");
            }
            else{
                System.out.println(number + " is a non-prime number");
            }
        }
    }
    
    /**
     * @param num
     * @return
     */
    static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}