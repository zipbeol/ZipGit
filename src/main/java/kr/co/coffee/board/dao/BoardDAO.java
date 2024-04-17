package kr.co.coffee.board.dao;

import java.util.List;

import kr.co.coffee.board.dto.BoardDTO;

public interface BoardDAO {

	int allCount(int pagePerCnt);

	List<BoardDTO> list(int pagePerCnt, int start);

}
