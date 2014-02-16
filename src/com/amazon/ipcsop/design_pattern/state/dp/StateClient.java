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
		 //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
	}

}
