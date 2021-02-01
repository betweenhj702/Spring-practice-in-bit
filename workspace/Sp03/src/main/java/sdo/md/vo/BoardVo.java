package sdo.md.vo;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import sdo.md.domain.Board;

@NoArgsConstructor
@Data
public class BoardVo {
	private int currentPage;
	private long totalCount;
	private int pageSize;
	private List<Board> list;
	private long totalPageCount;
	
	public BoardVo(int currentPage, long totalCount, int pageSize, List<Board> list) {
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
		this.list = list;
		this.totalPageCount = calTotalPageCount();
	}
	private long calTotalPageCount() {
		long tpc = totalCount/pageSize; 
		if(totalCount%pageSize != 0) tpc++;
		return tpc;
	}
}
