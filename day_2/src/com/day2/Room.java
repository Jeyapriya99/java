package com.day2;

public class Room {
	private int roomNumber;
	private String roomType;
	private float roomArea;
	
	public Room() {
		super();
	
	}
	public Room(int roomNumber, String roomType, float roomArea) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomArea = roomArea;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public float getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(float roomArea) {
		this.roomArea = roomArea;
	}
	public void getData() {
		System.out.println("ROOM NUMBER" + roomNumber);
		System.out.println("ROOM TYPE" + roomType);
		System.out.println("ROOM AREA" + roomArea);
	}

}
