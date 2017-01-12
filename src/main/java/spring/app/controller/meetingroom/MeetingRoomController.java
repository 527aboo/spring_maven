package spring.app.controller.meetingroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.app.service.meetingroom.MeetingRoomService;
import spring.entity.meetingroom.MeetingRoom;

@Controller
@RequestMapping("meetingRoom")
public class MeetingRoomController {
	
	@Autowired
	private MeetingRoomService meetingRoomService;
	
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		List<MeetingRoom> list = meetingRoomService.findAllMettingRoom();
		model.addAttribute("meetingRoom", list);
		return "meetingroom/list";
	}
	
	

}
