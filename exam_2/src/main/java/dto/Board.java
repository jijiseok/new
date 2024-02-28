package dto;

public class Board {
	private int num;
	private String title;
	private String content;
	private String regitime;
	private int hits;
	private int memberno;
	
	public Board() {}

	public Board(int num, String title, String content, String regitime, int hits, int memberno) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.regitime = regitime;
		this.hits = hits;
		this.memberno = memberno;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getRegitime() {
		return regitime;
	}


	public void setRegitime(String regitime) {
		this.regitime = regitime;
	}


	public int getHits() {
		return hits;
	}


	public void setHits(int hits) {
		this.hits = hits;
	}


	public int getMemberno() {
		return memberno;
	}


	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
