package com.itbank.mvc99;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {
   
   @Autowired
   BbsDAO dao;
   @Autowired
   ReplyDAO daoC;
   
   @RequestMapping("select")
   public String select(BbsDTO bbsDTO, Model model ) {
      BbsDTO dto = dao.select(bbsDTO);
      model.addAttribute("dto", dto);
      List<ReplyDTO> listC = daoC.selectAll();
		model.addAttribute("listC", listC);
      return "select";
   }
   
   @RequestMapping("selectAll")
   public String select(Model model ) {
      List<BbsDTO> list = dao.selectAll();
      model.addAttribute("list", list);
      return "selectAll";
   }
   
}