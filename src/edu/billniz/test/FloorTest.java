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

import edu.billniz.core.ControlPanel;
import edu.billniz.core.Floor;

/**
 * @author billniz
 *
 */
public class FloorTest {
	
	private Floor floor;
	private ControlPanel panel;
	private final int Fourfloor = 4;
	private final int fiveFloors = 5;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		panel = new ControlPanel();
		floor = new Floor(fiveFloors);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		floor = null;
		panel = null;
	}

	/**
	 * Test method for {@link edu.billniz.core.Floor#Floor(int)}.
	 */
	@Test
	public void testFloor() {
		
		floor = new Floor(Fourfloor);
		assertNotNull(floor);
		assertEquals(Fourfloor, floor.getNumber());
		
	}

	/**
	 * Test method for {@link edu.billniz.core.Floor#addControlPannel(edu.billniz.core.ControlPanel)}.
	 */
	@Test
	public void testAddControlPannel() {
		floor.addControlPannel(panel);
		assertTrue(floor.getControlPanel().contains(panel));
	}

	/**
	 * Test method for {@link edu.billniz.core.Floor#getPanel(int)}.
	 */
	@Test
	public void testGetPanel() {
		floor.addControlPannel(panel);
		assertEquals(panel, floor.getPanel(0));
		assertNull(floor.getPanel(1));
		
	}

}
