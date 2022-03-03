import java.util.*;
class Solution 
{
    public int[] solution(int[] A, int K) 
    
    {
    	 int[] newArray = new int[A.length];

        for(int i=0; i<A.length; i++)

        {

            int m = (i+K)%A.length;

            newArray[m] = A[i]
       }

        return newArray;
    	
        // write your code in Java SE 8
    }
}
class ArrayRotate 
{
	public static void main(String[] args) 
	{
		int A[] = {3, 8, 9, 7, 6};
		Solution s = new Solution();
		s.solution([3, 8, 9, 7, 6],3);
		
	}

}
