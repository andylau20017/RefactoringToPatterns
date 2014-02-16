/**
 * 
 * 将创建过程搬移到Factory
用来实例化一个类的数据和代码在多个类中到处都是。将有关创建的知识搬移到一个Factory类中。
 
动机：当创建一个对象的知识散步在多个类中，说明出现了创建蔓延问题：
将创建的职责放在了不应该承担对象创建任务的类中。
 
优点和缺点：
＋合并创建逻辑和实例化/配置选项
＋将客户代码与创建逻辑解耦
－如果可以直接实例化，会使设计复杂化
 
做法：
1、实例化类就是一个与其他类合作实例化产品的类。如果实例化类没有使用Creation Method实例化产品，就需要修改，
而且如果必要，还应该修改产品的类，这样就可以通过Creation Method进行实例化。
2、创建一个将成为工厂的新类，根据工厂所创建的产品给它命名。
3、应用搬移方法重构将Creation Method搬移到工厂类中。如果Creation Method是静态的，可以在搬移到工厂类之后将其改为非静态的。
4、将实例化类更新为实例化工厂对象，并调用工厂对象获取类的实例。
5、在实例化中仍然使用其他类的数据和方法。
 */


package com.amazon.ipcsop.design_pattern.factory;

import java.util.Map;

/**
 * @author erfeiliu
 *
 */
public class AWSFactory {
	public S3Client createS3Client(string key, Map otherParams){
		// create s3 client here
	}
	
	public ElasticCacheClient createElasticCacheClient(){
		
	}
	
	public SNSClient createSNSClient(){
	
	}
}
