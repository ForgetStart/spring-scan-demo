/**
 * 
 */
package cn.com.fd.aop;

/**
 * <p> Description: </p>
 * @author fengda
 * @date 2017年1月12日 下午4:54:54
 */
public class ArithmeticCalculatorLoggingImpl implements ArithmeticCalculator{

	@Override
	public int add(int i, int j) {
		int result = i + j; 
		return result;
	}

	@Override
	public int sub(int i, int j) {
		int result = i - j; 
		return result;
	}

	@Override
	public int mul(int i, int j) {
		int result = i * j; 
		return result;
	}

	@Override
	public int div(int i, int j) {
		int result = i / j; 
		return result;
	}

}
