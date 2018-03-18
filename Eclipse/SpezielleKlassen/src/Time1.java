import java.io.*;

public class Time1 implements Serializable {
	private int hour;
	private int minute;
	private int second;

	public Time1(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	// der folgende Programmteil wäre bei serializable nicht notwendig!!
	public Time1() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
