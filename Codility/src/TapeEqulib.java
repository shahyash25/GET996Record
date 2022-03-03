import java.util.*;

class Solution 
{
    public int solution(int[] A)
    {
		    	int N = A.length;
		
			    int sum1 = A[0];
			    int sum2 = 0;
			    int P = 1;
		    for (int i = P; i < N; i++)
		    {
		        sum2 += A[i];
		    }
		    int diff = Math.abs(sum1 - sum2);
		
		    for (; P < N-1; P++) 
		    {
		        sum1 += A[P];
		        sum2 -= A[P];
		
		        int newDiff = Math.abs(sum1 - sum2);
		        if (newDiff < diff) 
		        {
		            diff = newDiff;
		        }
    }
    return diff;
    }
}



public class TapeEqulib 

{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution t = new Solution();
		

	}

}
