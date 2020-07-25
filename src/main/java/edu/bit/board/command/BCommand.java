package edu.bit.board.command;

import org.springframework.ui.Model;

public interface BCommand {
	void execute(Model model);
	
}
