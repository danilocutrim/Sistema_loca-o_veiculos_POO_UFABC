package Principal;


import db.Db;
import views.OptionsViews;

public class MAIN {

	public static void main(String[] args) {

		Db.LaunchDB();
		OptionsViews.MostrarMenu();

	}
}