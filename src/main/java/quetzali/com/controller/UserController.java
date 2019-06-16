package quetzali.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import quetzali.com.constants.Views;
import quetzali.com.dao.entity.UserEntity;
import quetzali.com.service.IUserService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private IUserService userService;
	@GetMapping("/users")
	public String users(Model model) {
		List<UserEntity> users = userService.findAll();
		model.addAttribute("users", users);
		return Views.USUARIOS.getView();
	}
}
