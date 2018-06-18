package immutable;

public class SpezialImmutable extends Immutable
{
	
	private char[] array;

	public SpezialImmutable(int zahl, char[] arr, String text) {
		super(zahl, arr, text);
		// TODO Auto-generated constructor stub
	}

	
	public char[] holeArray()
	{
		return array;
	}
	
	
}
