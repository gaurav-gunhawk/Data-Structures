public class Stack {
	public static void main(String args[])
	{
		StackHelper st = new StackHelper();
		st.push(43);
		st.push(63);
		st.push(41);
		st.pop();
		st.push(76);
		st.show();
	}
}

class StackHelper
{
	int stack[] = new int[5];
	int top = 0;
	
	void push(int data)
	{
		stack[top] = data;
		top++;
	}
	
	void pop()
	{
		top--;
		int data = stack[top];
		stack[top] = 0;
	}
	
	void show()
	{
		for(int i=0 ; i<stack.length ; i++)
		{
			System.out.println(stack[i]);
		}
	}
	
}

/*
Output of this program : 

	43
	63
	76
	0
	0

*/
