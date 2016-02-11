package Music.app.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SongList implements SongListInterface{
	private HashMap<String, SongDetail> songs;
	public ArrayList<SongDetail> songList;
	@Override
	public int addSong(SongDetail song) {
		// TODO Auto-generated method stub
		String songName;
		int index;
		
		//check if enough info added
		if (song.getName().length() == 0 || song.getName().length() == 0) {
			System.out.println("No name/artist entered");
			return -1;
		}
		
		//check if already exists
		songName = song.getName();
		if (songs.containsKey(songName)) {
			System.out.println("Song " + songName + " already exists");
			return -1;
		}
		
		//check intended index
		index = Collections.binarySearch(songList, song);
		if (index < 0) {
			index++;
			index *= -1;
		}
		
		songs.put(songName, song);
		songList.add(index, song);
		return 1;
	}
	@Override
	public int editSong(SongDetail song, int index) {
		// TODO Auto-generated method stub
		SongDetail temp;
		String songName;
		int tempIndex;
		
		//get temp data of edited song
		temp = songList.get(index);
		songName = temp.getName();
		
		//remove existing data from list and hashmap
		songs.remove(songName);
		songList.remove(index);
		
		//check if no data in edit (remove song)
		if (song.getName().length() == 0 || song.getArtist().length() == 0 || songs.containsKey(songName)) {
			System.out.println("No data found, removing");
			songs.put(songName,  temp);
			tempIndex = Collections.binarySearch(songList, temp);
			tempIndex *= -1;
			songList.add(tempIndex, temp);
			return -1;
		}
		
		//add edited data
		songs.put(songName, song);
		tempIndex = Collections.binarySearch(songList, songName);
		tempIndex++;
		tempIndex *= -1;
		songList.add(tempIndex, song);
		return 1;
	}

	@Override
	public void deleteSong(int index) {
		// TODO Auto-generated method stub
		songs.remove(songs.get(index).getName());
		songList.remove(index);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return songList.size();
	}

	@Override
	public int getIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SongDetail getSong(int index) {
		// TODO Auto-generated method stub
		return songList.get(index);
	}

	@Override
	public ArrayList<SongDetail> getSongs() {
		// TODO Auto-generated method stub
		return songList;
	}
	
}
