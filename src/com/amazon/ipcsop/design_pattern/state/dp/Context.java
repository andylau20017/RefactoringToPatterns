/**
 * 
 */
package com.amazon.ipcsop.design_pattern.state.dp;

/**
 * @author erfeiliu
 *
 */
public class Context {

	private State state;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void setState(State state){
		this.state = state;
	}

	public void request(String sampleParameter){
		state.handle(sampleParameter);
	}
}
