package MyJavaProjects.Grundlagen.src.objects;

import java.io.File;

public class CInhaltDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\temp");
		if (file.isDirectory())
		{
			String[] inhalt = file.list()
;
			for (int i=0; i<inhalt.length; i++)
				System.out.println(inhalt[i]);
			}
	}

}
