package minion;

public class Minion{
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	public Minion(String n, int e, String c, String m) {
		name = n;
		eyes = e;
		color = c;
		master = m;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setEyes(int e) {
		eyes = e;
	}
	public int getEyes() {
		return eyes;
	}
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public void setMaster(String m) {
		master = m;
	}
	public String getMaster() {
		return master;
	}
}