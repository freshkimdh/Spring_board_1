package edu.bit.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import edu.bit.board.dao.BDao;
import edu.bit.board.dto.BDto;

public class BContentCommand implements BCommand {

   @Override
   public void execute(Model model) {
      Map<String, Object> map = model.asMap();
      HttpServletRequest request = (HttpServletRequest)map.get("request");
      
      String bId = request.getParameter("bId");
      
      BDao dao = new BDao();
      BDto dto = dao.contentView(bId);
      
      model.addAttribute("content_view", dto);

   }

}
