package spring.app.service.meetingroom;

import java.util.List;

import spring.entity.meetingroom.MeetingRoom;

public interface MeetingRoomService {
	
	List<MeetingRoom> findAllMettingRoom();
	
	MeetingRoom findByRoomId(int roomId);

	void insertMeetingRoom(String roomName);

	void updateMeetingRoom(MeetingRoom meetingRoom);

	void deleteMeetingRoom(int roomId);
		
}
