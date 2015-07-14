package models;

public abstract class Entity {
	protected String name;
	protected String filePath;
	protected boolean isCraftable; 
	protected int netWorth;
	public String getName() {
		return name;
	}
	public String getFilePath() {
		return filePath;
	}
	public boolean isCraftable() {
		return isCraftable;
	}
	public int getNetWorth() {
		return netWorth;
	}
	public void setNetWorth(int netWorth){
		this.netWorth = netWorth;
	}
}
