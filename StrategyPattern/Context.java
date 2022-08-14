package StrategyPattern;

public class Context {
	private Strategy str;

	public Context(Strategy str) {
		super();
		this.str = str;
	}
	public float executeStr(float num1,float num2)
	{
		return str.Calculation(num1, num2);
	}
}
