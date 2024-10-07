/**
 * 
 */
package mystack;

/**
 * @author Raisa Begum
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null) {
			System.out.println("Stack is empty.");
			return null;
		}
		T value = theStack.val;
		theStack = theStack.next;
		return value;

	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> intergerStack = new MyStack<>();
		intergerStack.push(1);
		intergerStack.push(2);
		System.out.println("Popped: " + intergerStack.pop());
		intergerStack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> personStack = new MyStack<>();
		Person p1 = new Person("fname", "lname");
		personStack.push(p1);
		Person p2 = new Person("Raisa", "Begum");
		personStack.push(p2);

		Person poppedPerson = personStack.pop();
		System.out.println("Popped person: " + poppedPerson.getFname() + " " + poppedPerson.getLname());
	}
}
