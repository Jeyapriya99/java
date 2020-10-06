package com.day2;

public class RoomMain {

	public static void main(String[] args) {
		Room room1 = new Room(12,"Classroom",1234.56f);
		room1.getData();
		Room room2 = new Room();
		room2.setRoomNumber(13);
		room2.setRoomType("Auditorium");
		room2.setRoomArea(98756.23f);
		room2.getData();

	}

}
