/**
 * 
 */
package com.amazon.ipcsop.design_pattern.command.dp;

/**
 * @author erfeiliu
 *
 */
public class TurnOnCommand implements Command {

	 private Player player;  
     
	    public TurnOnCommand(Player player) {  
	        this.player = player;  
	    }  
	      
	    public void execute() {  
	        this.player.turnOn();  
	    }  

}
