package soo.md.mapper;

import java.util.List;

import soo.md.domain.Board;
import soo.md.domain.BoardVo;

public interface BoardMapper {
	List<Board> selectPerPage(BoardVo boardVo);
	List<Board> selectByCatgo(BoardVo boardVo);
	Board selectBySeq(long seq);
	long selectCount();
	long selectCountByCatgo(BoardVo boardVo);
	
	void insert(Board board);
	void update(Board board);
	void delete(long seq);
}
