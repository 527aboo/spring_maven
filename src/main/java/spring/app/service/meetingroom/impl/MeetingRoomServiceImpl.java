package spring.app.service.meetingroom.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.app.dao.meetingroom.MeetingRoomDao;
import spring.app.form.meetingroom.MeetingRoomForm;
import spring.app.service.meetingroom.MeetingRoomService;
import spring.entity.meetingroom.MeetingRoom;

@Service("meetingRoomService")
@Transactional
public class MeetingRoomServiceImpl implements MeetingRoomService {
	
	@Autowired
	private MeetingRoomDao meetingRoomDao;

	public List<MeetingRoom> findAllMettingRoom() {
		List<MeetingRoom> list = meetingRoomDao.findAllMettingRoom();
		return list;
	}

	public MeetingRoomForm findByRoomId(int roomId) {
		MeetingRoom room = meetingRoomDao.findByRoomId(roomId);
		MeetingRoomForm form = new MeetingRoomForm();
		form.setRoomId(room.getRoomId());
		form.setRoomName(room.getRoomName());
		return form;
	}

	public void insertMeetingRoom(String roomName) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.setRoomName(roomName);
		meetingRoomDao.insertMeetingRoom(meetingRoom);
	}
	
	public void updateMeetingRoom(MeetingRoomForm meetingRoomForm) {
		MeetingRoom meetingRoom = new MeetingRoom();
		meetingRoom.setRoomId(meetingRoomForm.getRoomId());
		meetingRoom.setRoomName(meetingRoomForm.getRoomName());
		meetingRoomDao.updateMeetingRoom(meetingRoom);
	}
	
	public void deleteMeetingRoom(int roomId) {
		meetingRoomDao.deleteMeetingRoom(roomId);
	}

}
