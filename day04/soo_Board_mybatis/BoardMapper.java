package soo.md.mapper;

import java.util.List;

import soo.md.domain.Board;
import soo.md.domain.BoardVo;

public interface BoardMapper {
	List<Board> selectPerPage(BoardVo boardVo);
	long selectCount();
	Board content(long seq);
	void insert(Board board);
	void update(Board board);
	void delete(long seq);
}