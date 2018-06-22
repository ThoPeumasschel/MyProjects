package kartons;

public class KartonKarton extends BasicKarton implements IContainerKarton {

	private BasicKarton[] inhalt;
	int anzKartons;
	int inhaltsEbene;

	public KartonKarton(String aufschrift, int maxKartons) {
		super(aufschrift);
		this.inhalt = new BasicKarton[maxKartons];
	}

	public void setInhalt(BasicKarton[] inhalt) {
		this.inhalt = inhalt;
	}

	public void addInhalt(BasicKarton b) {
		b.setParent(this);
		inhalt[anzKartons++] = b;

	}

	public void deleteInhalt() {
		boolean isOkay = true;
		for (BasicKarton b : inhalt) {
			if (b != null) {
				if (!b.isEmpty()) {
					isOkay = false;
				}
			}
		}
		if (isOkay) {
			this.inhalt = new BasicKarton[inhalt.length];
			this.anzKartons = 0;
			System.out.println(getAufschrift() + ": Inhalt gelöscht!");
		} else {
			System.out
					.println("Untergeordnete Karton beinhalten noch Elemente! Inahlt kann nicht gelöscht werden!!!");
		}

	}

	public void deleteInhaltAt(int index) {
		if (inhalt[index].isEmpty()) {
			inhalt[index] = null;
		} else {
			System.out.println("Karton enhält noch Elemente");
		}
	}
	public void deleteForcedInhaltAt(int index) {
			inhalt[index] = null;
	}

	public String getInhalte() {
		StringBuilder output = new StringBuilder();
		for (BasicKarton b : inhalt) {
			if (b != null) {
				output.append(b.getAufschrift() + "\n");
			}
		}
		return new String(output);
	}

	public String getInhalteR() {
		StringBuilder output = new StringBuilder();
		for (BasicKarton b : inhalt) {
			if (b != null) {
				if (b instanceof IContainerKarton) {
					output.append(getTab(inhaltsEbene));
					output.append(b.getAufschrift() + "\n");
					((KartonKarton) b).setInhaltsebene(++inhaltsEbene);
					output.append(((KartonKarton) b).getInhalteR());
					inhaltsEbene--;

				} else {
					output.append(getTab(inhaltsEbene));
					output.append(b.getAufschrift() + "\n");
				}

			}
		}
		return new String(output);
	}

	private String getTab(int anz) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < anz; i++) {
			output.append("\t");
		}

		return new String(output);
	}

	private void setInhaltsebene(int Ie) {
		inhaltsEbene = Ie;
	}

	public BasicKarton[] getInhalt() {
		return inhalt;
	}
	

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < inhalt.length; i++) {
			if (inhalt[i] != null) {
				return false;
			}
		}
		return true;
	}

}
