package core;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());	
		
	}
	
	public void testPushElmTop() {
		Stack s1 = new Stack();
		assertFalse(s1.isFull());
		s1.push(new Integer(1));
		int top = (Integer)s1.getTop();
		assertEquals(1,top);
		
	}

	  public void testLastInFirstOut() {
	        Stack stack = new Stack();
	        assertTrue(stack.isEmpty());
	        
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);

	        assertEquals(3, stack.getTop());

	        assertEquals(3, stack.getTop());
	        assertEquals(3, stack.pop());
	        assertEquals(2, stack.getTop());
	        assertEquals(2, stack.pop());
	        assertEquals(1, stack.getTop());
	        assertEquals(1, stack.pop());

	        assertTrue(stack.isEmpty());
	    }
	    
	  
	/*  public void testPushToFullStack() {
	        Stack stack = new Stack();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);

	        assertTrue(stack.isFull());

	        // Attempt to push to a full stack should result in an exception
	        assertThrows(PushToFullStackException.class, () -> {
	            stack.push(4);
	        });
	    }*/
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
   /* public void testPushDifferentElmTypeToStack() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());

        stack.push(42);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            stack.push(true);
        });

        assertEquals("All elements in the stack must be of the same type.", exception.getMessage());

        assertEquals(1, stack.getSize());
        assertEquals(42, stack.getTop());
    }*/
    
  
}


