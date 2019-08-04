package Principal;


import db.Db;
import views.LoginView;

public class MAIN {

	public static void main(String[] args) throws Exception {

		Db.LaunchDB();
		LoginView.Login();
		
		
	}
}