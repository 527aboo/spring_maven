package spring.app.controller.meetingroom;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javassist.compiler.ast.Variable;
import spring.app.form.meetingroom.InsertMeetingRoomForm;
import spring.app.service.meetingroom.MeetingRoomService;
import spring.entity.meetingroom.MeetingRoom;

@Controller
@RequestMapping("meetingroom")
public class MeetingRoomController {
	
	@Autowired
	private MeetingRoomService meetingRoomService;
	
	@RequestMapping(path="list", method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		List<MeetingRoom> list = meetingRoomService.findAllMettingRoom();
		model.addAttribute("meetingRoom", list);
		return "meetingroom/list";
	}
	
	@RequestMapping(path="insert", method = RequestMethod.GET)
	public String insert(Model model) {
		InsertMeetingRoomForm form = new InsertMeetingRoomForm();
		model.addAttribute(form);
		
		return "meetingroom/insert";
	}
	
	@RequestMapping(path="insertComplete", method = RequestMethod.POST)
	public String insertComplete(@Valid InsertMeetingRoomForm form, 
			BindingResult result) {
		
		if (result.hasErrors()) {
			return "meetingroom/insert";
		}
		
		meetingRoomService.insertMeetingRoom(form.getRoomName());
		
		return "meetingroom/list";
	}
	
	

}
