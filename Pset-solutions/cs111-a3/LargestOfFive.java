/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author: Ishaan Variava
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int arg3 = Integer.parseInt(args[2]);
        int arg4 = Integer.parseInt(args[3]);
        int arg5 = Integer.parseInt(args[4]);

        System.out.println(Math.max(Math.max(Math.max(arg1,arg2),Math.max(arg3,arg4)),arg5));

    }
}