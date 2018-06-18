package anonymeKlassen;

public class Food
{
    Popcorn p = new Popcorn()
    {
	public void sizzle()
	{
	    System.out.println("anonymus sizzling popcorn");
	}

	public void pop()
	{
	    System.out.println("anonymus popcorn");
	}
    };

    public void popIt()
    {
	p.pop();

    }
}
