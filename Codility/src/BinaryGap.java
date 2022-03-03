
 import java.util.*;
 
class Solution
{ 	
	public int solution(int N) 
    {
		//Solution -1 
		String binary = Integer.toBinaryString(N);
		System.out.println(Integer.toBinaryString(N));
		
		int count=0;
		List<Integer> lst = new ArrayList<Integer>();
		for(char i:binary.toCharArray())
		{
		if(i == '0')
		{
		count += 1;
		}
		else 
		{
		lst.add(count);
		count=0;
		}
		}
		return Collections.max(lst);
		}
	
			//solution -2
				        
				        
//				int finalGap = 0;
//				char binaryRep[] = Integer.toBinaryString(N).toCharArray();
//				int tempGap=0; 
//				for (int x = 0; x < binaryRep.length; x++) {
//				    if(binaryRep[x]=='0'){
//				        tempGap++;
//				        
//				    }else if(binaryRep[x]=='1'){
//				        if(tempGap>finalGap)
//				        finalGap=tempGap;
//				        tempGap=0;
//				    }
//				    
//				}
//				return finalGap;
//				
//				//solution -2
//				
//				char[] C = binary.toCharArray();
//				int i = Math.min(binary.lastIndexOf('1') + 1, C.length);
//				if (i <= 2) 
//				{
//				return 0;
//				}
//				String[] st = binary.substring(0, i).split ("1");
//				int a = 0;
//				for (String s : st) {
//				if (s.length() > a) {
//				a =s.length();
//				}
//				}
//				return a;
//				
//				// solution -3
//				int longestBinaryGap = 0;
//	            List<Integer> onesList = new ArrayList<Integer>();          
//	            for(int i=0; i<binaryString.length(); i++)
//	            {
//	              if(binaryString.charAt(i) == '0')
//	                          continue;
//	               onesList.add(i);
//	            }
//	            System.out.println(onesList);
//
//	            for(int i=0; i<onesList.size() - 1; i++)
//	            {
//	              int indicesDiff = onesList.get(i+1) - onesList.get(i) - 1;        
//	              longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
//	            }
//	            return longestBinaryGap;
//	            
//				//solution -4
//	            
//	            boolean start = false;
//
//	            
//
//	            int counter = 0;
//
//	            int maxCount = 0;
//
//	            
//
//	            for(int i=0; i<bString.length(); i++)
//
//	            {
//
//	                String c = bString.substring(i, i+1);
//
//	                //System.out.println(c);
//
//	                if(c.equals("1")) {
//
//	                    if(start) {
//
//	                            if(counter > maxCount) {
//
//	                                maxCount = counter;
//
//	                            }
//
//	                        }
//
//	                        counter = 0;
//
//	                        start = true;
//
//	                    }
//
//	                    if(c.equals("0")) {
//
//	                        counter++;
//
//	                }
//
//	                
//
//	            }
//
//	            
//
//	          return maxCount;

				
	}

		

class BinaryGap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.solution(65);
		
		// demo code
		
	}

}
