import java.util.*;
class Solution 
{

     int solution(int X, int Y, int D)

     {

		     int progress = X;
		
		     int count=0;
		
		     while(progress<Y) 
		
			 {
			
			     progress=progress+D;
			
			     count++;
			
			 }

		     return count;

     }

}
public class FrogJump 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Solution n = new Solution();
		n.solution(10,20,30);

	}

}
