package question06;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	Song(String title, String artist,int year, String country){
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
	}
	public Song() {
	}
	public void show() {
		System.out.println(year+"년, "+country+"국적의 "+artist+"가 부른 "+title);
	}
		
	public static void main(String[] args) {
	Song singer= new Song("Dancing Queen","ABBA",1978, "스웨덴");
	singer.show();
	}
}
