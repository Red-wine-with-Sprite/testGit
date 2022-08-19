package maventext;

import org.junit.Test;

/**
 * @Author lt.lq
 * @Date 2022年8月19日 下午3:47:22
 */

public class TestDemo {
	
	@Test
	public void testHello() {
		Demo demo = new Demo();
		String maven = demo.hello("Maven");
		System.out.println(maven);
		System.out.println("更新1");
		System.out.println("更新2");
		System.out.println("更新3");
		System.out.println("创建分支");
		System.out.println("主线添加");
	}

}
