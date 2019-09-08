package test.java;

import org.junit.Before;
import org.junit.Test;

public class GradleMsgTest {
	private GradleMsg gMsg;
	
	@Before
	public void printMsg() throws Exception{
		gMsg = new GradleMsg("안녕 , Gradle");
		System.out.println("==작업 전==>> ");
	}
	
	@Test
	public void testMsg(){
		gMsg = new GradleMsg("Hello, Gradle");
		String msg = gMsg.returnMsg("Gradle");
		System.out.println("==@Test==>> " + msg);
	}
}
