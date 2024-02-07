package com.frostix.backend.domain.board.service;

import com.frostix.backend.domain.board.VO.boardVO;

import java.util.Map;

public interface boardService {
    boardVO getBoard(int id);
    Map<Integer, boardVO> getBoardList();
}
