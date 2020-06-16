package final1;
import java.util.*; 
public class equalsInt {

	// Java program to check if the given 
	// stacks are equal or not 
	
	  
	 
	 
	  
	// Function to check if the two given 
	// stacks are same 
	static boolean isSameStack(Stack<Integer> stack1,  
	                            Stack<Integer> stack2) 
	{ 
	    // Create a flag variable 
	    boolean flag = true; 
	  
	    // Check if size of both stacks are same 
	    if (stack1.size() != stack2.size()) 
	    { 
	        flag = false; 
	        return flag; 
	    } 
	  
	    // Until the stacks are not empty 
	    // compare top of both stacks 
	    while (stack1.empty() == false) 
	    { 
	        // If the top elements of both stacks 
	        // are same 
	        if (stack1.peek() == stack2.peek()) 
	        { 
	            // Pop top of both stacks 
	            stack1.pop(); 
	            stack2.pop(); 
	        } 
	        else
	        { 
	            // Otherwise, set flag to false 
	            flag = false; 
	            break; 
	        } 
	    } 
	  
	    // Return flag 
	    return flag; 
	} 
	  
	// Driver Code 
	public static void main(String arr[])  
	{ 
	    // Creating stacks 
	    Stack<Integer> stack1 = new Stack<Integer>(); 
	    Stack<Integer> stack2 = new Stack<Integer>(); 
	  
	    // Inserting elements to stack1 
	    stack1.push(3); 
	    stack1.push(4); 
	    stack1.push(6); 
	    stack1.push(8); 
	    stack1.push(98); 
	  
	    // Inserting elements to stack2 
	    stack2.push(3); 
	    stack2.push(4); 
	    stack2.push(6); 
	    stack2.push(8); 
	    stack2.push(9); 
	  
	    if (isSameStack(stack1, stack2)) 
	        System.out.println("Stacks are Same"); 
	    else
	        System.out.println("Stacks are not Same"); 
	  
	} 
	} 
	  
	
