package org.zerock.b01.service;

import org.zerock.b01.dto.NoticeDTO;
import org.zerock.b01.dto.PageRequestDTO;

import java.util.List;

public interface NoticeService {
  List<NoticeDTO> getNoticeList(PageRequestDTO pageRequestDTO);
}
