//FILENAME: Test.java

interface IntStack {
	void push(int item);
	int pop();
}

class FixedStack implements IntStack {
	private int stck[];
	private int tos;

	FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	public void push(int item) {
		if(tos == stck.length - 1) 
			System.out.println("Stack is Full");
		else 
			stck[++tos] = item;
	}

	public int pop() {
		if(tos < 0) {
			System.out.println("Stack empty");
			return 0;
		} else 
			return stck[tos--];
	}
}

class Test {
	public static void main(String args[]) {
		FixedStack stack1 = new FixedStack(4);
		FixedStack stack2 = new FixedStack(6);

		for(int i = 0; i < 4; i++) stack1.push(i);
		for(int i = 0; i < 6; i++) stack2.push(i);

		System.out.println("Stack1: ");
		for(int i = 0; i < 4; i++)
			System.out.println(stack1.pop());

		System.out.println("Stack2: ");
		for(int i = 0; i < 6; i++)
			System.out.println(stack2.pop());
	}
}

/*OUTPUT:

C:\Users\Swati\swati>javac Test.java
C:\Users\Swati\swati>java Test
Stack1:
3
2
1
0
Stack2:
5
4
3
2
1
0
*/
