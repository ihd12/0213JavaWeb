package org.zerock.b01.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.b01.dto.MemberDTO;
import org.zerock.b01.service.MemberService;

@Controller
@RequestMapping("/member")
@Log4j2
@RequiredArgsConstructor
public class MemberController {
  private final MemberService memberService;
  @GetMapping("/join")
  public String join(MemberDTO memberDTO) {
    return "/ex/join";
  }
  @PostMapping("/join")
  public String addJoin(MemberDTO memberDTO) {
    memberDTO.setEmail1(memberDTO.getMember_id());
    memberService.register(memberDTO);
    return "redirect:/ex/index";
  }

  @PostMapping("/login")
  public String login(HttpServletRequest req, String id, String password) {
    MemberDTO loginInfo = memberService.login(id,password);
    HttpSession session = req.getSession();
    session.setAttribute("loginInfo", loginInfo);
    return "redirect:/ex/index";
  }
}
















