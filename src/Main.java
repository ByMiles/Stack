import data.*;
import stack.Stack;
import stack.Stackable;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Ted", "Lala", 0, 0, 0);
		Student s2 = new Student("Max", "Power", 0, 0, 0);
		Student s3 = new Student("Susi", "Geil", 0, 0, 0);

		
		Stackable<Student> stack = new Stack<Student>();
		
		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		
		stack.print();
		
		System.out.println("Size:  " + stack.size());
		System.out.println("Get:   " + stack.pop());
		System.out.println("Size:  " + stack.size());
		System.out.println("Empty: " + stack.empty());
		System.out.println("Peek : " + stack.peek());
		System.out.println("Size:  " + stack.size());
		
		
		stack.pop();
		stack.pop();
		
		System.out.println("Size:  " + stack.size());
		System.out.println("Empty: " + stack.empty());
	}
	
}
