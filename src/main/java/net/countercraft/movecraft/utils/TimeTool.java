package net.countercraft.movecraft.utils;

import net.countercraft.movecraft.craft.CraftManager;

public class TimeTool {
	private static final TimeTool ourInstance = new TimeTool();
	private long lastChunkCheck;
	
	public static TimeTool getInstance() {
		return ourInstance;
	}
	
	public void setLastChunkCheck(long update) {
		this.lastChunkCheck=update;
	}
	
	public long getLastChunkCheck() {
		return this.lastChunkCheck;
	}

}