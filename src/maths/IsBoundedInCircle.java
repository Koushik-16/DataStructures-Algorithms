package maths;

public class IsBoundedInCircle {
	
	public static boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int dir = 0;
        for(int i =0 ; i < instructions.length() ;i++ ){
            char ch = instructions.charAt(i);
            if(ch == 'L'){
                dir--;
                if(dir < 0) dir += 4;
            }
            else if(ch == 'R') dir = (dir + 1) % 4;
            else {
               if(dir == 0) y++;
               else if(dir == 1) x++;
               else if(dir == 2) y--;
               else x--;
            }
        }
        if(x == 0 && y == 0) return true;
        return dir != 0;
      
    }

	public static void main(String[] args) {
		

	}

}
