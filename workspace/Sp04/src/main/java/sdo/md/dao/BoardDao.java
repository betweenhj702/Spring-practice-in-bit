package sdo.md.dao;

import java.util.List;

import sdo.md.domain.Board;

public interface BoardDao {
	List<Board> list(int cp, int ps);
	void insert(Board board);
	Board showContent(long seq);
	void delete(long seq);
	void update(Board board);
	long getTotalCount();
}
