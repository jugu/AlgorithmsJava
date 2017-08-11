package datastructure;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import datastructure.queue.Queue;
import datastructure.queue.QueueException;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;

import static org.junit.Assert.assertEquals;

/**
 * @author jugudanniesundar
 *
 */
public class TestQueue {
	
	/**
	 * 
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/**
	 * @throws QueueException 
	 * 
	 */
	@Test
	public void testEmptyQueue() throws QueueException {
		Queue<Integer> q = new Queue<Integer>();
		assertTrue(q.isEmpty());
		thrown.expect(QueueException.class);
		q.peek();
	}
	
	/**
	 * 
	 */
	@Test
	public void testQueueAdd() {
		Queue<Integer> q = new Queue<Integer>();
		q.add(2);
		assertEquals(q.size(), 1);
		q.add(1);
		assertEquals(q.size(), 2);
		q.add(3);
		assertEquals(3, q.size());
	}
	
	/**
	 * 
	 */
	@Test
	public void testQueueAddDynamic() {
		Queue<Integer> q = new Queue<Integer>();
		for (int i = 1; i <= 12; i++) {
			q.add(i);
		}
		assertEquals(12, q.size());
	}
	
	/**
	 * @throws QueueException 
	 * 
	 */
	@Test
	public void testQueuePoll() throws QueueException{
		Queue<Integer> q = new Queue<Integer>();
		for (int i = 1; i <= 5; i++) {
			q.add(i);
		}
		assertEquals(q.size(), 5);
		for (int expected = 1; expected <= 5; expected++) {
			int actual = q.poll();
			assertEquals(expected, actual);
		}
		assertTrue(q.isEmpty());
		thrown.expect(QueueException.class);
		q.peek();
	}
}
