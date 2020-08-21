package com.project.springbootproject.service;

import com.project.springbootproject.domain.repository.BoardRepository;
import com.project.springbootproject.dto.BoardDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardRepository boardRepository;

    public long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();

    }
}
