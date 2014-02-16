/**
 * 
 */
package com.amazon.ipcsop.design_pattern.command.dp;

/**
 * @author erfeiliu
 *
 */
public class PlayerInvoker {
	private TurnOnCommand on;  
    private TurnOffCommand off;  
    private NextCommand next;  
    public PlayerInvoker(TurnOnCommand on,TurnOffCommand off,NextCommand next) {  
        this.on = on;  
        this.off = off;  
        this.next = next;  
    }  
      
    public void turnOn(){         
        this.on.execute();  
    }  
      
    public void turnOff(){        
        this.off.execute();  
    }  
      
    public void next(){       
        this.next.execute();  
    }  

}
