/**
 The MIT License (MIT)

Copyright (c) 2014 Bill Nizeyimana

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */
package edu.billniz.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.billniz.core.Floor;
import edu.billniz.core.Hospital;

/**
 * @author billniz
 *
 */
public class HospitalTest {

	private Hospital hospital;
	private final String NAME = "Saint Joseph";
	private Floor floor1;
	private Floor floor2;
	private Floor floor3;
	private Floor floor4;
	private Floor floor5;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		hospital = new Hospital(NAME);
		floor1 = new Floor(0);
		floor2 = new Floor(1);
		floor3 = new Floor(2);
		floor4 = new Floor(3);
		floor5 = new Floor(4);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		floor1 = null;
		floor2 = null;
		floor3 = null;
		floor4 = null;
		floor5 = null;
	}

	/**
	 * Test method for {@link edu.billniz.core.Hospital#Hospital(java.lang.String)}.
	 */
	@Test
	public void testHospital() {
		assertNotNull(hospital);
		assertEquals(NAME, hospital.getName());
	}

	/**
	 * Test method for {@link edu.billniz.core.Hospital#numberOfFloors()}.
	 */
	@Test
	public void testNumberOfFloors() {
		assertEquals(0, hospital.numberOfFloors());
		hospital.addFloor(floor1);
		assertEquals(1, hospital.numberOfFloors());
		for (int i = 1; i < 10; i++) {
			hospital.addFloor(new Floor(i));
		}
		assertEquals(10, hospital.numberOfFloors());
	}

	/**
	 * Test method for {@link edu.billniz.core.Hospital#addFloor(edu.billniz.core.Floor)}.
	 */
	@Test
	public void testAddFloor() {
		hospital.addFloor(floor1);
		assertTrue(hospital.getFloors().contains(floor1));
		
		Floor sameFloor = new Floor(0);
		hospital.addFloor(sameFloor);
		assertFalse(hospital.getFloors().contains(sameFloor));
	}

	/**
	 * Test method for {@link edu.billniz.core.Hospital#getFloor(int)}.
	 */
	@Test
	public void testGetFloor() {
		
		assertNull(hospital.getFloor(10));
		hospital.addFloor(floor1);
		hospital.addFloor(floor2);
		hospital.addFloor(floor3);
		assertEquals(floor1, hospital.getFloor(0));
		assertEquals(floor2, hospital.getFloor(1));
		assertEquals(floor3, hospital.getFloor(2));
	}

	/**
	 * Test method for {@link edu.billniz.core.Hospital#deleteFloor(int)}.
	 */
	@Test
	public void testDeleteFloorInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link edu.billniz.core.Hospital#deleteFloor(edu.billniz.core.Floor)}.
	 */
	@Test
	public void testDeleteFloorFloor() {
		fail("Not yet implemented"); // TODO
	}

}
