import java.util.Scanner;
class assignment
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
      		String s = in.nextLine();
      		System.out.println("You entered string "+s);
		char[] c=s.toCharArray();
		int loopcount=0;
		int count=0;
		
		System.out.println("Capitalize the alternate char of the string ");
	
		for (int i = 0, len = s.length(); i < len; i++)
		{
    			char ch = s.charAt(i);
    			if (i % 2 == 0) 
			{
        			System.out.print(Character.toLowerCase(ch));
   			}
			else
			{
        			System.out.print(Character.toUpperCase(ch));
    			}
		}
		System.out.println();


		System.out.println("Count the no of occurance of particular char in the string  ");
		for(int i=0;i<c.length;i++)
		{
			boolean flag=true;
			for(int k=0;k<i;k++)
			{
				if(c[i]==(s.charAt(k)))
				flag=false;
			}
			if(flag)
			{
				for(int j=0;j<s.length();j++)
				{
					if(c[i]==s.charAt(j))
					count=count+1;
				}
				System.out.println(c[i]+" "+" "+(count));
				count=0;
				loopcount++;
			}
		}	
	}
}

