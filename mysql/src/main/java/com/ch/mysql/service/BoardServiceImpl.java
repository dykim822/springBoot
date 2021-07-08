package com.ch.mysql.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ch.mysql.dto.BoardDto;
import com.ch.mysql.mapper.BoardMapper;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper bm;
	public List<BoardDto> selectBoardList() {
		return bm.selectBoardList();
	}
	public int insert(BoardDto board) {
		return bm.insert(board);
	}
	public BoardDto select(int boardIdx) {
		return bm.select(boardIdx);
	}
}