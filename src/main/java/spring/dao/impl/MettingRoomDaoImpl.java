package spring.dao.impl;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.MeetingRoomDao;
import spring.entity.MeetingRoom;

@Service
public class MettingRoomDaoImpl implements MeetingRoomDao {
	
	@Autowired
	private MeetingRoomDao meetingRoomDao;

	@Transactional
	public void insertMeetingRoom(MeetingRoom meetingRoom) {
		meetingRoomDao.insertMeetingRoom(meetingRoom);		
	}

	public List<MeetingRoom> findAllMettingRoom() {
		return meetingRoomDao.findAllMettingRoom();		
	}
	
	

}
