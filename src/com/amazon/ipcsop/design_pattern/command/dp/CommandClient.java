/**
 * 
 */
package com.amazon.ipcsop.design_pattern.command.dp;

/**
 * @author erfeiliu
 *
 */
public class CommandClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();  
	    TurnOnCommand  on = new TurnOnCommand(player);  
	    TurnOffCommand  off = new TurnOffCommand(player);  
	    NextCommand  next = new NextCommand(player);  
	      
	    PlayerInvoker invoker = new PlayerInvoker(on, off, next);  
	      
	    invoker.turnOn();  
	    invoker.turnOff();  
	    invoker.next();  
	}

}
