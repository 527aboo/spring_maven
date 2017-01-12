package spring.app.service.meetingroom.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.app.dao.meetingroom.MeetingRoomDao;
import spring.app.service.meetingroom.MeetingRoomService;
import spring.entity.meetingroom.MeetingRoom;

@Service("meetingRoomService")
@Transactional
public class MeetingRoomServiceImpl implements MeetingRoomService {
	
	@Autowired
	private MeetingRoomDao meetingRoomDao;

	public void insertMeetingRoom(MeetingRoom meetingRoom) {
		meetingRoomDao.insertMeetingRoom(meetingRoom);
	}

	public List<MeetingRoom> findAllMettingRoom() {
		List<MeetingRoom> list = meetingRoomDao.findAllMettingRoom();
		return list;
	}

}
