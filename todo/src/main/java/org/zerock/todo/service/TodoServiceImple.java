package org.zerock.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.todo.dto.PageRequestDTO;
import org.zerock.todo.dto.PageResponseDTO;
import org.zerock.todo.dto.TodoDTO;
import org.zerock.todo.mappers.TodoMapper;

import groovy.util.logging.Log4j2;
import lombok.RequiredArgsConstructor;

@Service
@Log4j2
@RequiredArgsConstructor
public class TodoServiceImple implements TodoService{
    
    private final TodoMapper todoMapper;

    @Override
    public PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO) {
        List<TodoDTO> list = todoMapper.list(pageRequestDTO);
        long total = todoMapper.listCount(pageRequestDTO);
    
        return PageResponseDTO.<TodoDTO>withAll()
        .list(list)
        .total(total)
        .build();
    }

  
}
