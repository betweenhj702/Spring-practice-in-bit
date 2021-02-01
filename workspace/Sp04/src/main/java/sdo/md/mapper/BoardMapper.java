package sdo.md.mapper;

import java.util.List;
import java.util.Map;

import sdo.md.domain.Board;

public interface BoardMapper {
	List<Board> list(Map<String,Integer> map);
	long getTotalCount();
	void insert(Board board);
	Board showContent(long seq);
	void delete(long seq);
	void update(Board board);
	
}
