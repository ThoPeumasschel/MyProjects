package kartons;


//in diesem interface stehen methoden, welche nur der containerkarton nutzt
public interface IContainerKarton {
    	
	public void addInhalt(BasicKarton b);
	public void deleteForcedInhaltAt(int index);
	public BasicKarton[] getInhalt();
}
