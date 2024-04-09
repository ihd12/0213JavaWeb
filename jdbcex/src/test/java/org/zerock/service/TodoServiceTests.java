package org.zerock.service;

import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.domain.TodoVO;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import java.time.LocalDate;

public class TodoServiceTests {
  private TodoService todoService;
  @Test
  public void testRegister() throws Exception {
    TodoDTO todo = TodoDTO.builder()
        .title("JDBC Test Title...")
        .dueDate(LocalDate.now())
        .build();
    todoService.register(todo);
  }
}
