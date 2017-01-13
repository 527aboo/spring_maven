package spring.app.dao.meetingroom;

import java.util.List;

import spring.entity.meetingroom.MeetingRoom;


public interface MeetingRoomDao {
	
	List<MeetingRoom> findAllMettingRoom();

	MeetingRoom findByRoomId(int roomId);
	
	void insertMeetingRoom(MeetingRoom meetingRoom);
	
	void updateMeetingRoom(MeetingRoom meetingRoom);

	void deleteMeetingRoom(int roomId);
	
}
