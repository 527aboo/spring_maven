package spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="meeting_room")
public class MeetngRoom {
	
	@Id
	@GeneratedValue
	@Column(name="room_id")
	private Integer roomId;
	
	@Column(name="room_name")
	private String roomName;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "MeetngRoom ["
				+ "roomId=" + roomId 
				+ ", roomName=" + roomName 
				+ "]";
	}

	
	
	

}
