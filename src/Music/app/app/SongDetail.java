package Music.app.app;
	
public class SongDetail {
	private String songName;
	private String songArtist;
	private String songAlbum;
	private String songYear;
	
	public SongDetail() {
		songName = "";
		songArtist = "";
		songAlbum = "";
		songYear = "";
	}
	
	public SongDetail(String name, String artist, String album, String year) {
		this.songName = name;
		this.songArtist = artist;
		if (album != "") {
			this.songAlbum = album;
		}
		if (year != "") {
			this.songYear = year;
		}
	}
	
	//Getters
	public String getName() {
		return songName;
	}
	public String getArtist() {
		return songArtist;
	}
	public String getAlbum() {
		return songAlbum;
	}
	public String getYear() {
		return songYear;
	}
	
	//Setters
	public void setName(String name) {
		this.songName = name;
	}
	public void setArtist(String artist) {
		this.songArtist = artist;
	}
	public void setAlbum(String album) {
		this.songAlbum = album;
	}
	public void setYear(String year) {
		this.songYear = year;
	}
	
	//Compare for duplicates
	public void compareSongTo(SongDetail song) {
		if (this.getName().compareToIgnoreCase(song.getName()) == 0) {
			System.out.println("Same Name");
			if (this.getArtist().compareToIgnoreCase(song.getArtist()) == 0) {
				System.out.println("Same Artist");
			}
		}
		
	}
}
