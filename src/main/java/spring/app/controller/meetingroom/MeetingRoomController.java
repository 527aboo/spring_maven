package spring.app.controller.meetingroom;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javassist.compiler.ast.Variable;
import spring.app.form.meetingroom.MeetingRoomForm;
import spring.app.service.meetingroom.MeetingRoomService;
import spring.entity.meetingroom.MeetingRoom;

@Controller
@RequestMapping("meetingroom")
public class MeetingRoomController {
	
	@Autowired
	private MeetingRoomService meetingRoomService;
	
	@RequestMapping(value = "list", method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		List<MeetingRoom> list = meetingRoomService.findAllMettingRoom();
		model.addAttribute("meetingRoom", list);
		return "meetingroom/list";
	}
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String insert(Model model) {
		MeetingRoomForm form = new MeetingRoomForm();
		model.addAttribute(form);
		
		return "meetingroom/insert";
	}
	
	@RequestMapping(value = "insertComplete", method = RequestMethod.POST)
	public String insertComplete(@Valid MeetingRoomForm form, 
			BindingResult result) {
		
		if (result.hasErrors()) {
			return "meetingroom/insert";
		}
		
		meetingRoomService.insertMeetingRoom(form.getRoomName());
		
		return "meetingroom/insertComplete";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(String roomId, Model model) {
		
		if (StringUtils.isEmpty(roomId)) {
			return "meetingroom/list";
		}
		
		Integer id = Integer.parseInt(roomId);
		MeetingRoomForm form = meetingRoomService.findByRoomId(id);
		model.addAttribute(form);
		
		return "/meetingroom/update";
	}
	
	@RequestMapping(value = "updateComplete", method = RequestMethod.POST)
	public String updateComplete(@Valid MeetingRoomForm form,
			BindingResult result) {
		
		if (result.hasErrors()) {
			return "meetingroom/update";
		}
		
		meetingRoomService.updateMeetingRoom(form);
		return "meetingroom/updateComplete";
	}
	
	@RequestMapping(value = "deleteComplete", method = RequestMethod.POST)
	public String deleteComplete(String roomId) {
		
		
		if (StringUtils.isEmpty(roomId)) {
			return "meetingroom/list";
		}
		
		Integer id = Integer.parseInt(roomId);
			
		meetingRoomService.deleteMeetingRoom(id);
		return "meetingroom/updateComplete";
	}
	

}
