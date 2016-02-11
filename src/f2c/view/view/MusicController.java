package f2c.view.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MusicController {

	@FXML Button add;
	@FXML Button edit;
	@FXML Button delete;
	@FXML TextField f;
	@FXML TextField c;
	
	public ArrayList<String> read() throws FileNotFoundException {
		Scanner s = new Scanner(new File("filepath"));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
			list.add(s.next());
		}
		s.close();
		return list;
	}
	
	public void convert(ActionEvent e) {
		Button b = (Button)e.getSource();
		if (b == add) {
			System.out.println("add pressed");
		}
		if (b == edit) {
			System.out.println("edit pressed");
		}
		if (b == delete) {
			System.out.println("delete pressed");
		}
	}
	
}
