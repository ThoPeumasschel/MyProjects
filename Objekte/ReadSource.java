IMPORT JAVA.IO.*;

PUBLIC CLASS READSOURCE {

	PUBLIC STATIC VOID MAIN(STRING[] ARGS) {
		// TODO AUTO-GENERATED METHOD STUB
		TRY
		{
			FILEREADER FILE = NEW FILEREADER("READSOURCE.JAVA");
			BUFFEREDREADER BUFF = NEW BUFFEREDREADER(FILE);
			BOOLEAN EOF = FALSE;
			STRING LINE = NULL;
			WHILE (!EOF)
			{
				LINE = BUFF.READLINE();
				IF (LINE == NULL)
					EOF = TRUE;
				ELSE
					SYSTEM.OUT.PRINTLN(LINE);
			}
			BUFF.CLOSE();
		} CATCH (IOEXCEPTION E)
		{
			SYSTEM.OUT.PRINTLN("ERROR -- " + E.TOSTRING());
		}				
	}
}
