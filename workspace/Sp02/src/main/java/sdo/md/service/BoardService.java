package sdo.md.service;


import sdo.md.domain.Board;
import sdo.md.vo.BoardVo;

public interface BoardService {
	BoardVo listS(int cp, int ps);
	void insertS(Board board);
	Board showContentS(long seq);
	void deleteS(long seq);
	void updateS(Board board);
}
