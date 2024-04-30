package org.zerock.b01.controller;

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
    memberService.register(memberDTO);
    return "redirect:/member/join";
  }
}
