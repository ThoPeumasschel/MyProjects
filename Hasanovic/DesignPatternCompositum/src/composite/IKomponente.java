package composite;

// in diesem interface stehen alle methoden, �ber welche man diverse compositumstrukturen 
// von aussen einheitlich abarbeiten kann

public interface IKomponente
{

	Komponente getParent();

	String getName();
	// ...

}
