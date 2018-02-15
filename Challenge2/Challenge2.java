import java.util.*;

class Challenge2
{

	public static void main(String[] args)
	{	Stack st = new Stack();
		Scanner input = new Scanner(System.in);
		
		String word = input.nextLine();
	
		String[] token = word.split("");
		boolean flag = false;
	
		for(int i=0;i<token.length;i++)
		{
			st.push(token[i]);
		}
		String temp = "";
		for(int i=0;i<token.length;i++)
		{
			if(token[i].equals(st.peek()))
			{
				temp = temp + st.peek();
				st.pop();
			}
		}
		
		if(temp.equals(word))
		System.out.print(" Word is a Palindrome");
		else
		System.out.print(" Word is not a Palindrome");
	}
}