package spring.app.form.meetingroom;

import java.io.Serializable;


import org.hibernate.validator.constraints.NotEmpty;

public class InsertMeetingRoomForm implements Serializable {
	
	@NotEmpty(message = "{NotEMmpty.insertMeetingRoomForm.roomName}")
	private String roomName;

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

}
