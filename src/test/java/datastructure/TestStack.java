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
	
	
	/**
	 * Method to test Stack resizing by adding more than 10 elements
	 */
	@Test
	public void testStackResizePush() {
		Stack<Integer> stack = new Stack<Integer>();
		assertNotNull(stack);
		assertEquals(stack.size(), 0);
		assertTrue(stack.isEmpty());
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.push(18);
		stack.push(19);
		stack.push(21);
		// resize should occur at next insert
		stack.push(22);
		assertEquals(stack.size(), 11);
	}
	
	/**
	 * Method to test Stack resizing(contraction) by popping elements
	 * @throws StackException 
	 */
	@Test
	public void testStackResizePop() throws StackException {
		Stack<Integer> stack = new Stack<Integer>();
		assertNotNull(stack);
		assertEquals(stack.size(), 0);
		assertTrue(stack.isEmpty());
		for (int i = 0; i < 11; i++) {
			stack.push(i);
		}
		for (int i = 0; i < 11; i++) {
			stack.pop();
		}
		assertEquals(stack.size(), 0);
	}
	
}
