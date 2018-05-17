
public class Program {

	public static void main(String[] args) {
		String st = "Java ist easy";
		System.out.println("Stringverkettung: " + (st + 1234));
		System.out.println("Stringverkettung: " + st.concat("1234"));
		System.out.println("Contains: " + st.contains("java"));
		System.out.println("Umwandeln in Kleinbuchstaben: " + st.toLowerCase());
		System.out.println("Umwandeln + Contains: " + st.toLowerCase().contains("java"));
		System.out.println("Position ermitteln: " + st.indexOf("a"));
		System.out.println("Position ermitteln mit Startposition: " + st.indexOf("a", 5));
		System.out.println("Am Stringanfang enthalten: " + st.startsWith("Java"));
		System.out.println("Am Stringende enthalten: " + st.endsWith("x"));
		System.out.println("Zeichenketten Länge: " + st.length());
		System.out.println("Teilzeichenketten: " + st.substring(5, 8));
		System.out.println("Teilzeichenketten von Index bis Ende: " + st.substring(5));
		System.out.println("Ein Zeichen extrahieren: " + st.charAt(0));
		System.out.println("Zeichen ersetzen: " + st.replace("Java", "C++"));
		System.out.println("Zeichen ersetzen: " + st.replace(st.substring(0, 4), "C++"));
		System.out.println("Whitespace entfernen am Anfang und Ende: " + st.trim());
		System.out.println("Leerzechen entfernen überall: " + st.replace(" ", ""));
		
		
		
	}

}
