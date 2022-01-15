/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author: Ishaan Variava
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        String input = args[0];
        int digit, sum1=0, sum2=0;

        for(int i = input.length()-1;i>=0;i-=2){
            digit = Integer.parseInt(input.charAt(i) + "");
            sum1+=digit;
        }
        sum1%=10;
        //System.out.println(sum1);

        for(int i = input.length()-2;i>=0;i-=2){
            digit = Integer.parseInt(input.charAt(i) + "");
            sum2+=digit;
        }

        sum2%=10;
        sum2*=3;
        sum2%=10;
        //System.out.println(sum2);

        System.out.println((sum1+sum2)%10);
        
    }
}