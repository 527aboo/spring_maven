package spring.app.dao.meetingroom.impl;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Service;

import spring.app.dao.AbstractDao;
import spring.app.dao.meetingroom.MeetingRoomDao;
import spring.entity.meetingroom.MeetingRoom;


@Service
public class MettingRoomDaoImpl extends AbstractDao implements MeetingRoomDao {
	

	@Transactional
	public void insertMeetingRoom(MeetingRoom meetingRoom) {
		persisit(meetingRoom);		
	}

	@SuppressWarnings("unchecked")
	public List<MeetingRoom> findAllMettingRoom() {
		Criteria criteria = getSession().createCriteria(MeetingRoom.class);
		return (List<MeetingRoom>) criteria.list();
	}
	
	

}
