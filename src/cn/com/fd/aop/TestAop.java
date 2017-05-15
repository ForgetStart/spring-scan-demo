/**
 * 
 */
package cn.com.fd.aop;

/**
 * <p> Description: </p>
 * @author fengda
 * @date 2017年1月12日 下午5:06:36
 */
public class TestAop {

public static void main(String args[]){
		
		ArithmeticCalculator target = new ArithmeticCalculatorLoggingImpl();
		ArithmeticCalculator proxy = new ArithmeticCalaulatorLoggingProxy(target).getLoggingProxy();
		int result = proxy.add(2, 3);
		System.out.println("-->"+result);
		
		result = proxy.div(5, 2);
		System.out.println("--<"+result);
	}
}
