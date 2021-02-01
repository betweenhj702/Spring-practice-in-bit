package sdo.md.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sdo.md.dao.BoardDao;
import sdo.md.domain.Board;
import sdo.md.vo.BoardVo;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public BoardVo listS(int cp, int ps) {
		List<Board> list = boardDao.list(cp, ps);
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
