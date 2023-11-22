package core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Stack implements IStack {
	
	private ArrayList<Object> elms;
	
	public Stack() {
		elms = new ArrayList<Object>();
	}

	@Override
	public boolean isEmpty() {
		if(elms != null) {
			if( elms.size() == 0)
				return true;
			else
				return false;
		}else
			return true;
	}

	@Override
	public int getSize() {
		if(elms != null)
			return elms.size();
		else 
			return 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(Object elm) {
            elms.add(elm);
        
		
	}

	@Override
	public Object getTop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
            return elms.get(getSize() - 1);
        } else {
            return null; 
        }
	}

	 public Object pop() {
	        if (!isEmpty()) {
	            return elms.remove(getSize() - 1);
	        } else {
	            return null; 
	        }
	    }
	 
	/* public void testPushToFullStack() {
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
	 
	 
	 /*public void push(Object elm) {
		if (!isFull()) {
            elms.add(elm);
        } else {
            throw new PushToFullStackException("Cannot push to a full stack.");
        }
		
	*/
	 
	/* public void push(Object elm) {
			if (elms.isEmpty() || elm.getClass().equals(elms.get(0).getClass())) {
	            elms.add(elm);
	        } else {
	            throw new IllegalArgumentException("All elements in the stack must be of the same type.");
	        }
			
		}*/
	

}
