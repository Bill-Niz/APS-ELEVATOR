package edu.billniz.core;

import java.util.Date;

/**
*
* @author Bill Nizeyimana
*/
public class Elevator {
	
	private int currentFloor;
	private int defaultFloor = 0;
	private boolean isOutOfService;
	private Direction direction = Direction.NONE;
	private ControlPanel controlPanel;
	private Door door;
	private State state;
	private QueueManager queueManager;
	
	
	public class Door {
		private boolean isOpen;
		
		public void openDoor()
		{
			this.isOpen = true;
		}
		public void closeDoor()
		{
			this.isOpen = false;
		}
		public boolean isOpen()
		{
			return this.isOpen();
		}
	}
	
	public void moveUp()
	{
		
	}
	
	public void moveDown()
	{
		
	}
	
	public void alarm()
	{
		
	}
	
	public void callTheMechanic()
	{
		
	}
	
	public void stop()
	{
		
	}
	
	public void fixMe()
	{
		
	}
	
	public void breakMe()
	{
		
	}
	
	public void switchToState(State state)
	{
		
	}
	
	public Direction getDirection()
	{
		return this.direction;
	}
	
	public void addCallRequest(Priority priority, Direction direction, int destination, Date timeStamp)
	{
		
	}
	
	public void addRequest(int startFloor, int destinationFloor, Priority priority, Date timeStamp)
	{
		
	}
}
