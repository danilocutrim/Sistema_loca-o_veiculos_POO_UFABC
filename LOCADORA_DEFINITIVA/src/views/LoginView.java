package views;

import java.util.Scanner;

import db.Db;
import models.User.Usuario;

public abstract class LoginView {
    private static Scanner leitor = new Scanner(System.in);
    public static void Login()
    {
    	System.out.println("Digite seu Login: ");
    	String login = leitor.nextLine();
    	System.out.println("Digite sua Senha: ");
    	String senha = leitor.nextLine();
    	
    	
		for(Usuario user:Db.getTabelacliente())
		{
			if(user.getLogin().equals(login) && user.getSenha().equals(senha))
				OptionsViews.MostrarMenu();
    	}
		for(Usuario user:Db.getTabelafuncionario())
		{
			if(user.getLogin().equals(login) && user.getSenha().equals(senha))
				FuncionarioView.MostrarMenu();
    	}
		if(Db.getLogin().equals(login) && Db.getSenha().equals(senha))
			MasterView.MostrarMenu();
		System.out.println("Usuario não encontrado");
    }

}
