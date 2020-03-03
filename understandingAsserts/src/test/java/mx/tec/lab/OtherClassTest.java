package mx.tec.lab;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class OtherClassTest {
	@Test
	public void testMultiply() {
		OtherClass oc = new OtherClass();
		int x = 3;
		try {
	    	System.out.print(oc.multiply(x,222));
	    } catch (UnsupportedOperationException e) {
	        assertEquals("X should be less than 1000", e.getMessage());
	    }
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		OtherClass oc = new OtherClass();
		int x = 1000;
		try {
	    	System.out.print(oc.multiply(x,222));
	    } catch (UnsupportedOperationException e) {
	    	assertNotSame("X should be less than 1000", e.getMessage());	    }
	}
}
