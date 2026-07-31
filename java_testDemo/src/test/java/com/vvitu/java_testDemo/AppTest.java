

package com.vvitu.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//Assertions:are methods
//Annotations: are also methods,they address how and when the test will be done
public class AppTest {
	@Test
	public void testFindMax() {
		assertEquals(5,App.findMax(5,4));
	}
}