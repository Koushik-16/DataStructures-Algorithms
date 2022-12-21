package graph;

import java.util.*;
public class KpathQuery {

  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  int s = sc.nextInt();
 while(s-->0){

    int I = Integer.MAX_VALUE;
    
   
	
	int cost[][]=new int[6][6];
     


  
     int near[] = {I,I,I,I,I,I,I,I};
     
     int t [][] = new int[2][6];
     int i,j,n=7,min=I;
     int k=0;

     int u =-1;
     int v = -1;
     
     for(i = 1; i <=n; i++){
       for (j = i; j <=n; j++) {
         if(cost[i][j] < min){
           min = cost[i][j];
          u = i;
          v = j;
         }
       }
     }
      t[0][0] = u;
      t[1][0] = v;
      near[u] = 0;
      near[v] = 0;

      for(i =1; i<=n; i++){
        if(near[i]!=0) {
        if(cost[i][u] <cost[i][v])
          near[i] = u;
        else
          near[i] = v;
      }
      }
     
    for(i = 1; i <n-1; i++){
      min = I;

      for(j = 1; j <=n; j++){
        if(near[j]!=0 && cost[j][near[j]] < min ){
          k = j;
          min = cost[j][near[j]];
        }
      }
      t[0][i] = k;
      t[1][i] = near[k];
      near[k] = 0;

      for( j = 1; j<=n; j++){

        if(near[j]!=0 && cost[j][k] < cost[j][near[j]])
          near[j] = k;
      }
    }
  for(i = 0; i <n-1; i++){
    System.out.println(t[0][i]+" "+t[1][i]);
  }
  }
}


}