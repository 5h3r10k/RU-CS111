/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Ishaan Variava
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		int[] pushArr = new int[args.length];
		boolean dup = false;

		for(int i=0;i<args.length;i++){
			pushArr[i]=Integer.parseInt(args[i]);
		}

		for(int j = 0;j<pushArr.length;j++){

			for(int k=j+1;k<pushArr.length;k++){

				if(pushArr[j]==pushArr[k]){
					dup = true;
					break;
				}

			}

			if(dup) break;

		}

		System.out.println(dup);

	}
}
