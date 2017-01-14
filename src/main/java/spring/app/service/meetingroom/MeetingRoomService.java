package spring.app.service.meetingroom;

import java.util.List;

import spring.app.form.meetingroom.MeetingRoomForm;
import spring.entity.meetingroom.MeetingRoom;

public interface MeetingRoomService {
	
	List<MeetingRoom> findAllMettingRoom();
	
	MeetingRoomForm findByRoomId(int roomId);

	void insertMeetingRoom(String roomName);

	void updateMeetingRoom(MeetingRoomForm meetingRoomForm);

	void deleteMeetingRoom(int roomId);
		
}
