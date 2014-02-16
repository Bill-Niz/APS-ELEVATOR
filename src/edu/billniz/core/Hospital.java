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
package edu.billniz.core;

import java.util.ArrayList;

/**
 * @author billniz
 *
 */
public class Hospital {
	private String name;
	
	private ArrayList<Floor> floors = new ArrayList<>();
	
	
	/**
	 * @param name
	 */
	public Hospital(String name) {
		super();
		this.name = name;
	}
	/**
	 * 
	 * @return
	 */
	public int numberOfFloors()
	{
		return this.floors.size();
	}
	/**
	 * 
	 * @param floor
	 */
	public void addFloor(Floor floor)
	{
		this.floors.add(floor);
	}
	/**
	 * 
	 * @param floorNumber
	 * @return
	 */
	public Floor getFloor(int floorNumber) 
	{
		Floor floor = null;
		try {
			floor = floors.get(floorNumber);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		return floor;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the floors
	 */
	public ArrayList<Floor> getFloors() {
		return floors;
	}
	/**
	 * @param floors the floors to set
	 */
	public void setFloors(ArrayList<Floor> floors) {
		this.floors = floors;
	}
	/**
	 * 
	 * @param floorNumber
	 * @throws IllegalArgumentException
	 */
	public void deleteFloor(int floorNumber) throws IllegalArgumentException
	{
		if(floorNumber >= 0 && floorNumber > this.floors.size())
		{
			this.floors.remove(floorNumber);
		}else{
			throw new IllegalArgumentException();
		}
	}
	/**
	 * 
	 * @param floor
	 * @throws IllegalArgumentException
	 */
	public void deleteFloor(Floor floor) throws IllegalArgumentException
	{
		if(this.floors.contains(floor))
		{
			this.floors.remove(floor);
		}else{
			throw new IllegalArgumentException();
		}
	}
}
