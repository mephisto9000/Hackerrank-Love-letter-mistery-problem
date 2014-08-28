import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

	
	public int count(String s)
	{
		int result = 0;
		int len = s.length();
		boolean even = (len % 2 == 0) ? true : false ;
		
		int middle = (int) Math.ceil(len / 2);
		
		//System.out.println("middle="+middle);
		
		for (int i = 0; i <= middle; i++)
		{
			if (even)
			{
				if (i == middle) 
					break;
				//System.out.println("compare "+(middle+i)+" and "+(middle-i-1));
				if (s.charAt(middle+i) != s.charAt(middle-i-1))
					result += Math.abs((s.charAt(middle+i) - s.charAt(middle-i-1)));
				
			}
			else
			{
			//System.out.println("compare "+(middle+i)+" and "+(middle-i));
			if (s.charAt(middle+i) != s.charAt(middle-i))
				result += Math.abs((s.charAt(middle+i) - s.charAt(middle-i)));
			}
			
			 
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//StringBuffer sb = new
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testNum = Integer.parseInt(br.readLine());
		
		Solution s = new Solution();
		
		for (int i = 0; i < testNum; i++)
		{
			String str = br.readLine();
			System.out.println(s.count(str));
		}

	}

}
