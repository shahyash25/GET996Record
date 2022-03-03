
class Solution

public int solution(int[] A) 
{
        if(A.length<= 0) 
        {
            return -1;
        }
	    int unpaired=0;
	    for(int i=0;i<A.length;i++) 
	    {
	        unpaired = A[i];
	    }
	    return unpaired;
	}
}

public class ArrayUnpaired
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
