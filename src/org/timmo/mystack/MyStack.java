package org.timmo.mystack;

import java.util.LinkedList;

public class MyStack<T> {

	LinkedList<T> stack;
	
	public MyStack() {
		stack = new LinkedList<T>();
	}
	
	public void push(T item) {
		stack.addFirst(item);
	}
	
	public T pop() {
		T item = null;
		if (stack.size()>0)
			item = (T)stack.removeFirst();
		return item;
	}
	
	@Override
    public String toString() {
		String s = "";
		StringBuilder sB = new StringBuilder(s);
		sB.append("Stack elements: ");
		for (T element : stack) {
			sB.append(" ");
			sB.append(element.toString());
			sB.append(" ");
		}
		return sB.toString();
	}
	
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		System.out.println(stack);
		Integer a = stack.pop();
		Integer b = stack.pop();
		System.out.println(a);
		System.out.println(b);
		System.out.println(stack);
		
	}
}
