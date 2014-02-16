package edu.billniz.core;

import java.util.ArrayList;

/**
*
* @author Bill Nizeyimana
*/
public class Floor {
	
	private int number;
	private ArrayList<ControlPanel> controlPanels = new ArrayList<>();
	
	/**
	 * @param number
	 */
	public Floor(int number) {
		super();
		this.number = number;
	}
	/**
	 * 
	 * @param panel
	 */
	public void addControlPannel(ControlPanel panel)
	{
		this.controlPanels.add(panel);
	}
	/**
	 * 
	 * @param index
	 * @return
	 */
	public ControlPanel getPanel(int index)
	{
		ControlPanel panel = null;
		try{
			 panel = this.controlPanels.get(index);
		}catch(IndexOutOfBoundsException e)
		{}
		
		return panel;
	}
	/**
	 * @return the controlPanel
	 */
	public ArrayList<ControlPanel> getControlPanel() {
		return controlPanels;
	}
	/**
	 * @param controlPanel the controlPanel to set
	 */
	public void setControlPanel(ArrayList<ControlPanel> controlPanel) {
		this.controlPanels = controlPanel;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	
	
	

}
