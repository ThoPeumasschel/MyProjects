package compositumVisitor;
//welche methoden kann der kartonvisitor beim besuch einer jeden komponente ausf�hren?

//-> f�r jeden einzelnen compenenten-typ der struktur sollte hier eine entsprechende methode stehen(mindestens f�r alle leafs!)
public interface IKartonVisitor 
{
	void visitTextKarton(KartonText k);
	void visitGanzzahlKarton(KartonGanzzahl k);
	
	
	
	
	
	
	
}
