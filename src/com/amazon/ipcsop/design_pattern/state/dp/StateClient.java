/**
 * 
 */
package com.amazon.ipcsop.design_pattern.state.dp;

/**
 * @author erfeiliu
 *
 */
public class StateClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //����״̬
        State state = new ConcreteStateB();
        //��������
        Context context = new Context();
        //��״̬���õ�������
        context.setState(state);
        //����
        context.request("test");
	}

}
