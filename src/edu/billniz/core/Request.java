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

import java.util.Date;

/**
 * @author billniz
 *
 */
public class Request {

	private Priority priority;
	private int startFloor;
	private int destinationFloor;
	private Date timeStamp;
	
	/**
	 * @param priority
	 * @param startFloor
	 * @param destinationFloor
	 * @param timeStamp
	 */
	public Request(Priority priority, int startFloor, int destinationFloor,
			Date timeStamp) {
		super();
		this.priority = priority;
		this.startFloor = startFloor;
		this.destinationFloor = destinationFloor;
		this.timeStamp = timeStamp;
	}
	/**
	 * @return the priority
	 */
	public Priority getPriority() {
		return priority;
	}
	/**
	 * @return the startFloor
	 */
	public int getStartFloor() {
		return startFloor;
	}
	/**
	 * @return the destinationFloor
	 */
	public int getDestinationFloor() {
		return destinationFloor;
	}
	/**
	 * @return the timeStamp
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}
	
}
