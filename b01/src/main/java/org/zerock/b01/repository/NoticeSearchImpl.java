package org.zerock.b01.repository;

import com.querydsl.jpa.JPQLQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.zerock.b01.domain.Notice;
import org.zerock.b01.domain.QNotice;

public class NoticeSearchImpl extends QuerydslRepositorySupport implements NoticeSearch {
  public NoticeSearchImpl(){super(Notice.class);}
  @Override
  public Page<Notice> searchAll(String keyword, Pageable pageable) {
    QNotice notice = QNotice.notice;
    JPQLQuery<Notice> query = from(notice);
    if(keyword != null){
      query.where(notice.title.contains(keyword));
      query.where(notice.content.contains(keyword));
    }
    return null;
  }
}
