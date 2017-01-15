package spring.app.dao.meetingroom.impl;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import spring.app.dao.AbstractDao;
import spring.app.dao.meetingroom.MeetingRoomDao;
import spring.entity.meetingroom.MeetingRoom;


@Repository("meetingRoomDao")
public class MettingRoomDaoImpl extends AbstractDao implements MeetingRoomDao {
	
	@SuppressWarnings("unchecked")
	public List<MeetingRoom> findAllMettingRoom() {
		Criteria criteria = getSession().createCriteria(MeetingRoom.class).addOrder(Order.asc("roomId"));
		return (List<MeetingRoom>) criteria.list();
	}

	public MeetingRoom findByRoomId(int roomId) {
		Criteria criteria = getSession().createCriteria(MeetingRoom.class);
		criteria.add(Restrictions.eq("roomId", roomId));
		return (MeetingRoom) criteria.uniqueResult();
	}

	@Transactional
	public void insertMeetingRoom(MeetingRoom meetingRoom) {
		persisit(meetingRoom);		
	}

	public void updateMeetingRoom(MeetingRoom meetingRoom) {
		getSession().update(meetingRoom);
	}

	public void deleteMeetingRoom(int roomId) {
		// テーブル名とカラムはentityのクラスに定義した名前にする
		Query query = getSession().createQuery("delete from MeetingRoom where roomId = :roomId");
		query.setInteger("roomId", roomId);
		query.executeUpdate();
	}

}
