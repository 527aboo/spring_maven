package spring.app.dao.meetingroom;

import java.util.List;

import spring.entity.meetingroom.MeetingRoom;


public interface MeetingRoomDao {
	
	void insertMeetingRoom(MeetingRoom meetingRoom);
	
	List<MeetingRoom> findAllMettingRoom();

}
