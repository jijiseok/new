package dto;

import java.util.List;

public class ArticlePage {

	private int total; //전체 게시글의 개수 
	private int currentPage; //현재 페이지
	private List<Board> content; 
	private int totalPages; //전체 페이지의 개수
	private int startPage;
	private int endPage;
	
	
	public ArticlePage(int total, int currentPage,int size, List<Board> content) {
		
		//size : 한 페이지당 보여줄 갯수
		this.total = total;
		this.currentPage = currentPage;
		this.content = content;
		if(total == 0) { // 입력한게 없다면 전부 0으로 셋팅
			this.startPage = 0;
			this.startPage =0;
			this.endPage =0;
		}else {
			this.totalPages = total / size;//게시글 전부 나누기 size(페이지당 보이는 갯수)
			if(total % size > 0) { //나머지가 0보다크면 totalpages를 증가
				totalPages++;
			}
			int modVal = currentPage % 5;
			startPage = currentPage / 5 * 5 + 1;
			if (modVal ==0) startPage -= 5;
			
			//startPage, endPage: 화면 하단에 보여줄 페이지 이동 링크의 시작 번호와 끝 번호
			endPage = startPage + 4;
			if (endPage > totalPages) endPage = totalPages;
		}
	}
	
	public boolean hasNoArticles () {
		return total == 0;
	}
	
	public boolean hasArticles () {
		return total > 0;
	}

	public int getTotal() {
		return total;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public List<Board> getContent() {
		return content;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}
	
	
}
