package spring.app.form.meetingroom;

import java.io.Serializable;


import org.hibernate.validator.constraints.NotEmpty;

public class MeetingRoomForm implements Serializable {
	
	private int roomId;
	
	@NotEmpty(message ="{NotEmpty.insertMeetingRoomForm.roomName}")
	private String roomName;
	
	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

}
