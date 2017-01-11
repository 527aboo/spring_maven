package spring.dao;

import java.util.List;

import spring.entity.MeetingRoom;

public interface MeetingRoomDao {
	
	void insertMeetingRoom(MeetingRoom meetingRoom);
	
	List<MeetingRoom> findAllMettingRoom();

}
