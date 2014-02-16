/**
 * 
 */
package com.amazon.ipcsop.design_pattern.command.dp;

/**
 * @author erfeiliu
 *
 */
public class TurnOffCommand implements Command {

	private Player player;  
    
    public TurnOffCommand(Player player) {  
        this.player = player;  
    }  
      
    public void execute() {  
        this.player.turnOff();  
    }  

}
