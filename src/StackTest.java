
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

    public static final int CAPACITY = 20;
    private IntStack stack;

    @BeforeEach
    public void setUp() {
        stack = new IntStack(CAPACITY);
    }

    @Test
    public void testPush() {
        stack.push(4);
        assertEquals(4, stack.top());
        stack.push(5);
        assertEquals(5, stack.top());
        stack.push(6);
        assertEquals(6, stack.top());
    }

    @Test
    public void testPop() {
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.pop());
        assertEquals(5, stack.pop());
        assertEquals(4, stack.pop());
    }

    @Test
    public void testEmptyAndFull() {
        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());

        // Fill stack to max capacity.
        for (int i = 0; i < CAPACITY; i++) {
            stack.push(i);
        }

        assertFalse(stack.isEmpty());
        assertTrue(stack.isFull());

        // Empty the stack.
        for (int i = 0; i < CAPACITY - 1; i++) {
            stack.pop();
            assertFalse(stack.isEmpty());
            assertFalse(stack.isFull());
        }

        stack.pop();

        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());
    }

    @Test
    public void testStackOverflow() {
        for (int i = 0; i < CAPACITY; i++) {
            stack.push(i);
        }

        assertThrows(StackOverflowException.class, () -> stack.push(1));
    }

    @Test
    public void testStackUnderflow() {
        assertThrows(StackUnderflowException.class, () -> stack.pop());
    }

    @Test
    public void testStackToString() {
        assertEquals("[] <-- TOP", stack.toString());

        stack.push(4);
        assertEquals("[4] <-- TOP", stack.toString());

        stack.push(5);
        assertEquals("[4, 5] <-- TOP", stack.toString());

        stack.push(6);
        assertEquals("[4, 5, 6] <-- TOP", stack.toString());

    }

    @Test
    public void testBalancedParentheses() {
        assertTrue(Main.balanced("()"));
        assertTrue(Main.balanced("{}"));
        assertTrue(Main.balanced("[]"));
        assertTrue(Main.balanced("(){}[]"));

        assertTrue(Main.balanced("(())"));
        assertTrue(Main.balanced("[{}]"));

        assertFalse(Main.balanced("())"));
        assertFalse(Main.balanced("(()"));
        assertFalse(Main.balanced("[}{]"));
        assertFalse(Main.balanced("[{}}"));
        assertFalse(Main.balanced("([)]"));

        assertTrue(Main.balanced("([]{[]})"));
    }

}
