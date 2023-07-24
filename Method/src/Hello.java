import java.util.Arrays;

public class Hello {
  public static void main(String[] args) {
    int[][] points = new int[][]{{1,3},{3,3},{5,3},{2,2}};
    int[][] queries = new int[][] {{2,3,1},{4,3,1},{1,1,2}};
    System.out.println(points.length);

    
    int count=0;
        int circle=0;
        int[] Circle = new int[queries.length];
    for (int i=0;i<points.length;i++){
        if((points[i][0]-queries[circle][0])*(points[i][0]-queries[circle][0])+(points[i][1]-queries[circle][1])*(points[i][1]-queries[circle][1])-queries[circle][2]*queries[circle][2]<0){
            count++;
        }
        Circle[circle]=count;
        circle++;
        count=0;
    }

  }




  
}
