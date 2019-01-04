import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("SIZE : ");
		int sz = sc.nextInt();
		System.out.println("----------------------");
		Stack stack = new Stack(sz);
		String input;
		
		while(!stack.isFull()){
			System.out.print(">: ");
			input = sc.next();
			
			if(stack.isFull()){
				System.out.println("STACK IS FULL");
			}
			
			if(input.equals("push")){
				if(stack.isFull()){
					System.out.println(">: STACK IS FULL");
				}else{
					System.out.print("  >: ");
				int stackNode = sc.nextInt();
				stack.push(stackNode);
				}
			}else if(input.equals("pop")){
				stack.pop();
			}else if(input.equals("peek")){
				System.out.println("  <: " + stack.peek());
			}else if(input.equals("emp?")){
				if(stack.isEmpty()){
					System.out.println("  <: true");
				}else{
					System.out.println("  <: false");
				}	
			}
		}
	}
}

class Stack{
	private int size;
	private int stackArray[];
	private int top;
	
	public Stack(int size){
		this.size = size;
		stackArray = new int[size];
		top = -1;
	}
	
	public void push(int element){
		stackArray[++top] = element;
	}
	public int pop(){
		return stackArray[--top];
	}
	public int peek(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return top == -1;
	}
	public boolean isFull(){
		return top == size;
	}
}