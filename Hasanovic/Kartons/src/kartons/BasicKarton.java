package kartons;

public abstract class BasicKarton implements IComposite {

	private String aufschrift;
	private IContainerKarton parent;

	public BasicKarton(String aufschrift) {
		this.aufschrift = aufschrift;
	}

	public IContainerKarton getParent() {

		return parent;
	}

	public void setParent(IContainerKarton b) {
		parent = b;
	}

	public String getAufschrift() {
		return aufschrift;
	}

	public abstract boolean isEmpty();

	public abstract void deleteInhalt();

	public void verschiebeNach(IContainerKarton ziel) {

		IContainerKarton alt = this.getParent();
		ziel.addInhalt(this);
		alt.deleteForcedInhaltAt(this.getIndex());

	}

	private int getIndex() {
		BasicKarton[] elternInhalte = this.getParent().getInhalt();
		int pos = 0;
		for (int i = 0; i < elternInhalte.length; i++) {
			if (elternInhalte[i] != null) {
				if (elternInhalte[i].equals(this)) {
					pos = i;
				}

			}
		}
		return pos;
	}
}
