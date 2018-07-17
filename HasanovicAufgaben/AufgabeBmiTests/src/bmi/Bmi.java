package bmi;

import java.text.DecimalFormat;

public class Bmi
{

	private double weight;
	private double height;
	private String gender;

	public Bmi(double weight, double height, String gender)
	{
		this.weight = weight;
		this.height = height;
		this.gender = gender;
	}

	public Bmi(double weight, double height)
	{
		this.weight = weight;
		this.height = height;
	}

	public Bmi()
	{
		super();
	}
	// Methode soll die Parameter empfangen
	public long berechneBmi()
	{
		// weight in kg, height in meter

		long bmi = Math.round(weight / (height * height));

		
		//hier die getDiagnose aufrufen, nicht anders herum
		return bmi;

	}

	public String getDiagnosis()
	{

		String diagnosis = "";
		double bmi = berechneBmi();
		if (bmi > 40)
			diagnosis = "massive adiposity";
		else if (bmi >= 30 && bmi <= 40)
			diagnosis = "adiposity";
		else
		{
			if (gender == "w")

			{
				if (bmi < 19)
					diagnosis = "underweight";
				else if (bmi <= 24)
					diagnosis = "normal weight";
				else
					diagnosis = "overweight";
			} else
			{
				if (bmi < 20)
					diagnosis = "underweight";
				else if (bmi <= 25)
					diagnosis = "normal weight";
				else
					diagnosis = "overweight";
			}
		}
		return diagnosis;
	}

}
