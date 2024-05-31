package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(0), LIQUID(22.5), GAS(100);
	
	StatesOfMatter(double i) {
		this.celsiusTemp = i;
		// TODO Auto-generated constructor stub
	}
	
	private double celsiusTemp;

	public double getStateTemp()
	{
		return this.celsiusTemp;
	}
	
	public double convertFahrenheit(double c)
	{
		double f = (c * 9/5) + 32;
		return f;
	}
}
