package org.zerock.todo.mappers;

import java.util.List;

import org.zerock.todo.dto.PageRequestDTO;
import org.zerock.todo.dto.TodoDTO;

public interface TodoMapper {
  
  int insert(TodoDTO todoDTO);

  List<TodoDTO> list(PageRequestDTO pageRequestDTO);

  long listCount(PageRequestDTO pageRequestDTO);

}