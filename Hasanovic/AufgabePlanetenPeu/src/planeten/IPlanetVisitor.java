package planeten;

public interface IPlanetVisitor
{
	public void visitGemeinde(Gemeinde gemeinde);

	public void visitStaat(Staat staat);
}
