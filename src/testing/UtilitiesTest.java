package testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UtilitiesTest {
	private Utilities utilities;
	@Parameterized.Parameter
	private String stringToTest;
	@Parameterized.Parameter
	private String expected;

	public UtilitiesTest() {
	}

	@BeforeEach
	void setUp() {
		utilities = new Utilities();
	}

	@Parameterized.Parameters
	public static Collection<String[]> testConditions() {
		return Arrays.asList(new String[][]{
				{"AABCDDEFF","ABCDEF"},
				{"ABCCABDEEF","ABCABDEF"},
				{"1ABBCCDDEE","1ABCDE"},
				{"A","A"}

		});
	}

	@Test
	void everyNthChar() {
		char[] output = utilities.everyNthChar(new char[]{'h','e','l','l','o'},2);
		assertArrayEquals(new char[]{'e','l'},output);
	}

	@ParameterizedTest
	@MethodSource("testConditions")
	void removePairs(String stringTest,String stringExpected) {
		assertEquals(stringExpected,utilities.removePairs(stringTest));
	}

	@Test
	void removePairs_null(){
		assertNull(null,utilities.removePairs(null));
	}

	@Test
	void removePairs_minimunStrings(){
		assertEquals("A",utilities.removePairs("A"));
	}
	@Test
	void converter() {
		fail();
	}

	@Test
	void nullIfOddLength() {
		fail();
	}
}