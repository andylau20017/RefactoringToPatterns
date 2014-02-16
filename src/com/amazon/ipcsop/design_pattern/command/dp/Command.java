package com.amazon.ipcsop.design_pattern.command.dp;

//Command定义 
//将一个请求封装为一个对象，从而可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可取消的操作。 
// 优点: 解耦了调用者和接受者之间联系。调用者调用一个操作，接受者接受请求执行相应的动作，因为使用Command模式解耦，调用者无需知道接受者任何接口。 
// 缺点: 造成出现过多的具体命令类 

public interface Command {
	 public void execute();  
}
