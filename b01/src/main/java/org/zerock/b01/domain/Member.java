package org.zerock.b01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member extends BaseEntity {
  @Id
  private String mid;
  private String mpw;
  private String email;
  private boolean del;
  private boolean social;

//  @ElementCollection(fetch = FetchTypeLAZY)
}
