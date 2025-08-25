package DSA.Questions;
class Stack{
	int Stack[];
	int top;
	int MaxSize;
	
	Stack(int size) {
        MaxSize = size;
        Stack = new int[MaxSize];
        top = -1;
    }
	
	boolean isfull(){
		if(top ==MaxSize-1) {
			return true;
		}
		return false;
		}
	
	boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	void push(int val) {
        if (isfull()) {
            System.out.println("Stack Overflow");
        }
        else{
        	top++;
        	Stack[top]=val;
        }
	}
        
	int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
            	return Stack [top--];
            }
    }
}


public class ReverseString {
	
	public static void ReverseString (String str) {
		
		 int len = str.length();
		 Stack stack = new Stack(len);
		 
		 for (int i = 0; i < str.length(); i++) {
	            if (stack.isfull()) {
	                System.out.println("Stack Overflow while pushing characters");
	                return;
	            }
	            stack.push((int) str.charAt(i));
	        }

	        System.out.print("Reversed String: ");
	        while (!stack.isEmpty()) {
	            System.out.print((char) stack.pop());
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		String str = "Hello World";
        System.out.println("Original String: " + str);
        ReverseString(str);
		}

}
