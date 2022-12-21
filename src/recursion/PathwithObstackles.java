package recursion;

public class PathwithObstackles {

	public static void Path(String p,boolean maze [][] , int r , int c) {
		if(r == maze.length - 1 && c == maze[0].length - 1 ) {
			System.out.println(p);
			return;
		}
		
		if(maze[r][c] == false) return ;
		
	   if( r < maze.length - 1) {
		   Path(p + "V",maze, r + 1, c);
	   }
	   if( c < maze[0].length - 1 ) {
		   Path(p + "H",maze, r , c + 1);
	   }
	}
	
	public static void AllPaths(String P , boolean maze [][], int r, int c) {
		if(r == maze.length -1 && c == maze[0].length - 1) {
			System.out.println(P);
			return;
		}
		if(maze[r][c]== false) return;
		maze[r][c] =false;
		if(r > 0) {
			AllPaths(P + "U", maze, r-1,c);
		}
		if(c > 0) {
			AllPaths(P + "L",maze, r , c-1);
		}
		if(r < maze.length - 1 ) {
			AllPaths(P + "D",maze, r + 1 , c);
		}
		if(c < maze[0].length - 1) {
			AllPaths(P + "R",maze,r ,c+1);
		}
		maze[r][c] = true;	
	}
	
	public static void main(String[] args) {
		boolean board [][] = {
			{true,true,true},
			{true,true,true},
			{true,true,true}
		};
		AllPaths("",board,0,0);

	}

}
