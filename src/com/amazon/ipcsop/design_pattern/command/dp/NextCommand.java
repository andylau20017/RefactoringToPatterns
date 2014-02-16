/**
 * 
 */
package com.amazon.ipcsop.design_pattern.command.dp;

/**
 * @author erfeiliu
 *
 */
public class NextCommand implements Command {

	private Player player;  
    
    public NextCommand(Player player) {  
        this.player = player;  
    }  
      
    public void execute() {  
        this.player.next();  
    } 

}
