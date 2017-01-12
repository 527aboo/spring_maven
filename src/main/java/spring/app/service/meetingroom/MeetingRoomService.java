package spring.app.service.meetingroom;

import java.util.List;

import spring.entity.meetingroom.MeetingRoom;

public interface MeetingRoomService {
	
	void insertMeetingRoom(MeetingRoom meetingRoom);
	
	List<MeetingRoom> findAllMettingRoom();

}
