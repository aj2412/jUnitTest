package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class jUnitAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings("Arjit Kumar ", "Singh");
		assertEquals("Arjit Kumar Singh", result);
	}

}
