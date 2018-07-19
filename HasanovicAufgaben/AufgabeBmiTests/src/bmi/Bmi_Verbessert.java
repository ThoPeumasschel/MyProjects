package bmi;

import java.text.DecimalFormat;

public class Bmi_Verbessert
{

	// Methode soll die Parameter empfangen
	public String berechneBmi(double weight, double height, String gender)
	{
		// weight in kg, height in meter

		long bmi = Math.round(weight / (height * height));

		
		//hier die getDiagnose aufrufen, nicht anders herum
		String diag = getDiagnosis(bmi, gender);
		return "With a bmi of "+bmi+" you have "+diag;

	}

	public String getDiagnosis(long bmi, String gender)
	{

		String diagnosis = "";
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
