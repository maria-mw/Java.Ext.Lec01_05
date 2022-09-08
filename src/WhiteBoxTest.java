import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WhiteBoxTest {

	@Before
	public void setUp() throws Exception {
		wb = new WhiteBox();
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	private WhiteBox wb;
	private int[] array;

	/** Searching number is located in a middle position of the array */
	@Test
	public void numberLocatedInMiddlePositionOfArray(){
		assertEquals("Returned number doesn't equal to expected number (middle position)",1,wb.find(array, 10, 5));
	}

	/** Searching number is located in the first position of the array */
	@Test
	public void numberLocatedInFirstPositionOfArray(){
		assertEquals("Returned number doesn't equal to expected number (first position)",1,wb.find(array, 10, 0));
	}

	/** Searching number is located in the last position of the array */
	@Test
	public void numberLocatedInLastPositionOfArray(){
		assertEquals("Returned number doesn't equal to expected number (last position)",1,wb.find(array, 10, 9));
	}

	/** Searching number isn't located in the array */
	@Test
	public void numberIsNotInArray(){
		assertEquals("Number is not in array, but it doesn't return -1",-1,wb.find(array, 10, 15));
	}

	/** Array is Null */
	@Test
	public void arrayIsNull(){
		assertEquals("Array is Null, but it doesn't return -1",-1,wb.find(null, 10, 15));
	}

	/** Expected IllegalArgumentException as length parameter is more than length of the array and array != null */
	@Test (expected = IllegalArgumentException.class)
	public void lengthParameterMoreThanArrayLength(){
		wb.find(array, 5, 5);
	}

	/** Expected IllegalArgumentException as length parameter is less than length of the array and array != null */
	@Test (expected = IllegalArgumentException.class)
	public void lengthParameterLessThanArrayLength(){
		wb.find(array, 15, 5);
	}
}
