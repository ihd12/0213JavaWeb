package org.zerock.b01.service;

import org.zerock.b01.dto.MemberJoinDTO;

public interface MemberService {
  static class MidExistException extends Exception {}
  void join(MemberJoinDTO member) throws MidExistException;
  void modify(MemberJoinDTO member);
  boolean existMember(String mid);
  MemberJoinDTO getMember(String mid);
  void remove(String mid);
//  void modify(String mpw, String mid);
}
