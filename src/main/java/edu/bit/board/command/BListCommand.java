package edu.bit.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import edu.bit.board.dao.BDao;
import edu.bit.board.dto.BDto;

public class BListCommand implements BCommand {
	
	public void execute(Model model) {
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		
	}
	
}
