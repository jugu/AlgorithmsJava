package datastructure;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import datastructure.stack.Stack;
import datastructure.stack.StackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * @author jugudanniesundar
 *
 */
public class TestStack {
	
	/**
	 * Parameter to track expected exception in test cases
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	/**
	 * Method to test popping from empty stack
	 * @throws StackException 
	 */
	@Test
	public void testEmptyStackPop() throws StackException {
		Stack<Integer> stack = new Stack<Integer>();
		thrown.expect(StackException.class);
		thrown.expectMessage("Stack is empty");
		stack.pop();
	}
	
	/**
	 * Method to test pushing elements to stack
	 */
	@Test
	public void testStackPush() {
		Stack<Integer> stack = new Stack<Integer>();
		assertNotNull(stack);
		assertEquals(stack.size(), 0);
		assertTrue(stack.isEmpty());
		stack.push(11);
		assertEquals(stack.size(), 1);
		stack.push(12);
		assertEquals(stack.size(), 2);
		stack.push(12);
		assertEquals(stack.size(), 3);
	}
}
