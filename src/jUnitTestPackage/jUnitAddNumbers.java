package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class jUnitAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers (10, 20);
		assertEquals (30, result);
	}

}
