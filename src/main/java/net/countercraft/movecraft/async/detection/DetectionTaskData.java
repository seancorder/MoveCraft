/*
 * This file is part of Movecraft.
 *
 *     Movecraft is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Movecraft is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Movecraft.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.countercraft.movecraft.async.detection;

import net.countercraft.movecraft.utils.MovecraftLocation;

import org.bukkit.World;
import org.bukkit.entity.Player;

public class DetectionTaskData {
	private World w;
	private boolean failed;
	private boolean waterContact;
	private String failMessage;
	private MovecraftLocation[] blockList;
	private Player player;
	private Player notificationPlayer;
	private int[][][] hitBox;
	private Integer minX, minZ;
	private Integer[] allowedBlocks, forbiddenBlocks;

	public DetectionTaskData( World w, Player player, Player notificationPlayer, Integer[] allowedBlocks, Integer[] forbiddenBlocks ) {
		this.w = w;
		this.player = player;
		this.notificationPlayer = notificationPlayer;
		this.allowedBlocks = allowedBlocks;
		this.forbiddenBlocks = forbiddenBlocks;
		this.waterContact = false;
	}

	public DetectionTaskData() {
	}

	public Integer[] getAllowedBlocks() {
		return allowedBlocks;
	}

	public Integer[] getForbiddenBlocks() {
		return forbiddenBlocks;
	}

	public World getWorld() {
		return w;
	}

	void setWorld( World w ) {
		this.w = w;
	}

	public boolean failed() {
		return failed;
	}

	public boolean getWaterContact() {
		return waterContact;
	}

	public String getFailMessage() {
		return failMessage;
	}

	void setFailMessage( String failMessage ) {
		this.failMessage = failMessage;
	}

	public MovecraftLocation[] getBlockList() {
		return blockList;
	}

	void setBlockList( MovecraftLocation[] blockList ) {
		this.blockList = blockList;
	}

	public Player getPlayer() {
		return player;
	}

	public Player getNotificationPlayer() {
		return notificationPlayer;
	}

	public int[][][] getHitBox() {
		return hitBox;
	}

	void setHitBox( int[][][] hitBox ) {
		this.hitBox = hitBox;
	}

	public Integer getMinX() {
		return minX;
	}

	void setMinX( Integer minX ) {
		this.minX = minX;
	}

	public Integer getMinZ() {
		return minZ;
	}

	void setMinZ( Integer minZ ) {
		this.minZ = minZ;
	}

	void setFailed( boolean failed ) {
		this.failed = failed;
	}

	void setWaterContact( boolean waterContact ) {
		this.waterContact = waterContact;
	}

	void setPlayer( Player player ) {
		this.player = player;
	}
	void setNotificationPlayer( Player notificationPlayer ) {
		this.notificationPlayer = notificationPlayer;
	}
}
