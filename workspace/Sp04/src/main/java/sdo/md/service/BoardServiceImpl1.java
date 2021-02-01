package sdo.md.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdo.md.domain.Board;
import sdo.md.mapper.BoardMapper;
import sdo.md.vo.BoardVo;

@Service("BoardService1")
public class BoardServiceImpl1 implements BoardService {
	@Autowired
	private BoardMapper boardDao;
	@Override
	public BoardVo listS(int cp, int ps) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		int initRow = (cp-1)*ps;
		int lastRow = cp*ps;
		map.put("initRow",initRow);
		map.put("lastRow", lastRow);
		
		List<Board> list = boardDao.list(map);
		long totalCount = boardDao.getTotalCount();
		return new BoardVo(cp, totalCount, ps, list);
	}

	@Override
	public void insertS(Board board) {
		boardDao.insert(board);

	}

	@Override
	public Board showContentS(long seq) {
		
		return boardDao.showContent(seq);
	}

	@Override
	public void deleteS(long seq) {
		boardDao.delete(seq);

	}

	@Override
	public void updateS(Board board) {
		boardDao.update(board);

	}

}
