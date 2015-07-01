package net.chaptor10.innerclass;

import static org.junit.Assert.*;
import net.chaptor10.innnerclass.Pacel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PacelTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShip() {
		Pacel p1=new Pacel();
		Pacel p2=new Pacel();
		Pacel p3=new Pacel();
		assert("China".equals(p1.ship("China")));
		assert("India".equals(p2.ship("India")));
		assert("Japan".equals(p3.ship("Japan")));
	}

}
