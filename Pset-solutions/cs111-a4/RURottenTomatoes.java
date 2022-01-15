/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Ishaan Variava
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int rows = Integer.parseInt(args[0]); //find rows from cmd line
		int cols = Integer.parseInt(args[1]); //find cols from cmd line

		int[][] ratings = new int[rows][cols]; //create array

		for(int i=0;i<rows;i++){

			for(int j=0;j<cols;j++){

				ratings[i][j]=Integer.parseInt(args[2+(cols*i)+j]);

			}

		} 
		//populate array

		//System.out.println(Arrays.deepToString(ratings));
		//display array for testing

		int colsum; //var for current (each) column's sum
		int maxIndex = 0; //var for the index with greatest sum
		int maxSum = -1; //var for the highest sum so far

		for(int k=0;k<cols;k++){

			colsum=0; //reset sum of each column

			for(int m=0;m<rows;m++){
				colsum+=ratings[m][k];
			}
			//compute sum of each column

			if(colsum>maxSum){
				maxSum = colsum;
				maxIndex = k;
			}
			//only change maxIndex if greater than prev max

		}

		System.out.println(maxIndex); //print out maxIndex

	}
}
