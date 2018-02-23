
public class ruinUrCPU {

	static int findMax(int[] arr)
	{
		int max = 0;
		for(int i=1; i< arr.length; i++)
		{
			if(arr[i] > arr[max])
				max = i;
		}
		return max;
	}
	
	static int findElement(int[] arr, int element)
	{
		int pos =0;
		boolean isFound = false;
		while(!isFound && (pos < arr.length))
		{
			if (arr[pos] == element)
				isFound = true;
			else
				pos++;
		}
		if(isFound) // ist gleichwertig zu if(isFound == true)
			return pos;
		else
			return -1;
	}
	
	static void bubbleSort(int[] arr)
	{
		int temp = 0;
		for(int i = arr.length-1; i >= 0; i--)
		{
			for (int j = 0; j <= i-1; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	static int findElementBinary(int[] arr, int element)
	{
		boolean isFound = false;
		int left = 0, right = arr.length-1, middle = 0;
		
		while(!isFound && (left <=right))
		{
			middle = (left = right) / 2;
			if(arr[middle] == element)
			{
				isFound = true;
			}
			else
			{
				if(arr[middle] > element)
					right = middle -1;
				else
					left = middle +1;
				
			}
		}
		if(isFound)
			return middle;
		else
			return -1;
	}
	
	public static void main(String[]args)
	{
		int[] arg = {3,6,2,12,1,15,13,9};
		int res, find = 9;
		
		for(int i=0; i < arg.length; i++)
			System.out.print(arg[i] + " ");
		System.out.println("<- array ist noch unsortiert!");
		System.out.println();
		
		res = findMax(arg);
		
		System.out.println("Der Maximalwert des Arrays ist: " + arg[res] + " an der stelle " +  res);
		System.out.println();
		
		res = findElement(arg, find);
		if(res == -1)
			System.out.println("Die Zahl " + find + " wurde nicht gefunden!");
		else
			System.out.println("Index der gesuchten Zahl ist: " + res + " Der Wert im Array: " + arg[res]);
		System.out.println();
		
		bubbleSort(arg);
		for(int i=0; i < arg.length; i++)
			System.out.print(arg[i] + " ");
		System.out.println("<- Ist nun sortiert!");
		System.out.println();
		
		res = findElement(arg, find);
		if(res == -1)
			System.out.println("Die Zahl " + find + " wurde nicht gefunden!");
		else
			System.out.println("Index der gesuchten Zahl ist nach der Sortierung: " + res + " Der Wert im Array: " + arg[res]);
			System.out.println();
			
		res = findElementBinary(arg, find);
		if(res == -1)
			System.out.println("Die Zahl " + find + " wurde nicht gefunden!");
		else
			System.out.println("Index der gesuchten Zahl ist: " + res + " Der Wert im Array: " + arg[res]);
		
		
	}
	
}
