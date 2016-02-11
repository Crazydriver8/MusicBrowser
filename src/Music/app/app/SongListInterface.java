package Music.app.app;

import java.util.ArrayList;

public interface SongListInterface {
	public int addSong(SongDetail song);
	public int editSong(SongDetail song);
	public void deleteSong();
	public int getSize();
	public int getIndex();
	public SongDetail getSong(int index);
	public ArrayList<SongDetail> getSongs();
}
