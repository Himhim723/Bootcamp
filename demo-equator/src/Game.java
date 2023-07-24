import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Game{
	public static void main(String[] args) {
        int m=5;
        int[] queries = new int[]{3,1,2,1};
        int[] P = new int[m];
        for(int i=1;i<=m;i++){
            P[i-1]=i;
        }
        System.out.println(Arrays.toString(P));

        int[][] people = new int[][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] sequence = new int[people.length][2];
       int[] temp = new int[2];
       for(int i=0;i<people.length-1;i++){
           for(int k=i+1;k<people.length;k++){
               if(people[i][1]>people[k][1]){
                   temp = people[i];
                   people[i] = people[k];
                   people[k] = temp;
               }
           }
       } 
       for(int i=0;i<people.length;i++){
        for(int k = 0;k<people[i].length;k++){
       System.out.print(people[i][k]+"  ");
       }
       System.out.println();
    }
    System.out.println();

        for(int i=0;i<people.length-1;i++){
           for(int k=i+1;k<people.length;k++){
               if(people[i][1]==people[k][1]&&people[i][0]>people[k][0]){
                   temp = people[i];
                   people[i] = people[k];
                   people[k] = temp;
               }
           }
       } 
       for(int i=0;i<people.length;i++){
        for(int k = 0;k<people[i].length;k++){
       System.out.print(people[i][k]+"  ");
       }
       System.out.println();
    }
}
}	