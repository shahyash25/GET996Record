
class Solution
{
		public int solution(int[] A) 
		{
		int n=A.length;
		int sum=((n+1)*(n+2))/2;
		for(int i=0;i<n;i++)
		sum-=A[i];
		return sum;
		}
}
public class ArrayMissing 
{
	public static void main(String[] args) 
	{
		Solution n = new Solution();
		n.solution(50);
		
	}

}
