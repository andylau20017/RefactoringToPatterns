/**
 * 
 * ���������̰��Ƶ�Factory
����ʵ����һ��������ݺʹ����ڶ�����е������ǡ����йش�����֪ʶ���Ƶ�һ��Factory���С�
 
������������һ�������֪ʶɢ���ڶ�����У�˵�������˴����������⣺
��������ְ������˲�Ӧ�óе����󴴽���������С�
 
�ŵ��ȱ�㣺
���ϲ������߼���ʵ����/����ѡ��
�����ͻ������봴���߼�����
���������ֱ��ʵ��������ʹ��Ƹ��ӻ�
 
������
1��ʵ���������һ�������������ʵ������Ʒ���ࡣ���ʵ������û��ʹ��Creation Methodʵ������Ʒ������Ҫ�޸ģ�
���������Ҫ����Ӧ���޸Ĳ�Ʒ���࣬�����Ϳ���ͨ��Creation Method����ʵ������
2������һ������Ϊ���������࣬���ݹ����������Ĳ�Ʒ����������
3��Ӧ�ð��Ʒ����ع���Creation Method���Ƶ��������С����Creation Method�Ǿ�̬�ģ������ڰ��Ƶ�������֮�����Ϊ�Ǿ�̬�ġ�
4����ʵ���������Ϊʵ�����������󣬲����ù��������ȡ���ʵ����
5����ʵ��������Ȼʹ������������ݺͷ�����
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
