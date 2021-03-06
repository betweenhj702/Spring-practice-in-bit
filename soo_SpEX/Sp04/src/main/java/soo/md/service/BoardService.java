package soo.md.service;

import soo.md.domain.Board;
import soo.md.domain.BoardListResult;

public interface BoardService {
	BoardListResult getBoardListResult(int cp, int ps);
	BoardListResult getBoardListResult(String catgo, String keyword, int cp, int ps);
	Board getBoard(long seq);
	
	void write(Board board);
	void edit(Board board);
	void remove(long seq);
}
