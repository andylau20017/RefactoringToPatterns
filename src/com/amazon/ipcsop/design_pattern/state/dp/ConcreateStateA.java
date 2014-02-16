/**
 * 
 */
package com.amazon.ipcsop.design_pattern.state.dp;

/**
 * @author erfeiliu
 *
 */
public class ConcreateStateA implements State {

	/* (non-Javadoc)
	 * @see com.amazon.ipcsop.design_pattern.state.dp.State#handle(java.lang.String)
	 */
	@Override
	public void handle(String sampleParameter) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteStateA handle £º" + sampleParameter);
	}

}
