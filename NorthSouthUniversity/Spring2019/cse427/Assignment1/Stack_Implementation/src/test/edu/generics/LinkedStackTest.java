package test.edu.generics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for LinkedStack.
 */
public class LinkedStackTest extends StackTest {

	private static int CAPACITY = 40;

    @Before
    public void makeBoundedStack() {
        s = new LinkStack(CAPACITY);
    }

    @Test(expected=IllegalStateException.class)
    public void testPushToFullStack() {
        for (int i = 0; i < CAPACITY; i++) {
            s.push("abc");
        }
        s.push("abc");
    }
}