/*
Java program to find Factorial of number.
Examples
Input: 4
Output: 24
Input: 8
Output: 40320
*/
import java.util.Scanner;
public class Main {

    public static long FirstFactorial(long num) {
        long res=1;
        while(num>1){
            res*=num;
            num--;
        }
        return res;
    }    
    public static void main(String[] args) {
        System.out.println("Compile by Shubham Singh Rawat");
        Scanner s = null;
        long num;
        try {
            s= new Scanner(System.in);
            System.out.print("\nEnter a number to find its factorial: ");
            num = s.nextLong();
            System.out.print("\nFactorial of the given number [ "+num+"! ] is: "+FirstFactorial(num)+"\n");
        } finally{
            if(s!=null){
                s.close();
            }
        }
    }
}
