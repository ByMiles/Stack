package stack;

public interface Stackable<T> {
	
	void push(T obj);
	
	T pop();
	
	T peek();
	
	int size();
	
	boolean empty();
	
	void clear();
	
	void print();

}
