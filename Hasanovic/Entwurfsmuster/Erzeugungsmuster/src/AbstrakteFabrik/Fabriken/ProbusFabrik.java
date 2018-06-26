package AbstrakteFabrik.Fabriken;

import AbstrakteFabrik.Produkte.*;

public class ProbusFabrik extends HeimautomationFabrik 
{

	@Override
	public TemperaturSensor erzeugeTemperaturSensor() 
	{
		return new ProbusTemperaturSensor();
	}

	@Override
	public JalousieAktor erzeugeJalousieAktor() 
	{
		return new ProbusJalousieAktor();
	}
}
