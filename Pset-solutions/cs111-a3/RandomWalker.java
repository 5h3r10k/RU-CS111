/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Ishaan Variava
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int dir;
        int x=0,y=0;
        System.out.println("("+x+","+y+")");

        for(int i=0;i<n;i++){
            dir = (int)(4*Math.random());
            
            if(dir==0){
                x++;
            }else if(dir==1){
                x--;
            }else if(dir==2){
                y++;
            }else{
                y--;
            }

            System.out.println("("+x+","+y+")");
        }
        
        double squareDist = Math.pow(x,2)+Math.pow(y, 2);

        System.out.println("Squared Distance = "+squareDist);

    }
}
