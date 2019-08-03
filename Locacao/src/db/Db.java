package db;
import models.Locacao.Locar;
import models.User.Usuario;
import models.veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Db {
    //Lista para armazenamento de clientes
    private static List<models.User.Usuario> tabelacliente;
    //Lista para armazenamento de funcionarios
    private static List<models.User.Usuario> tabelafuncionario;
    //Lista para armazenamento de carros
    private static List<models.veiculos.Veiculo> tabelaveiculos;
    //Lista para armazenamento de novas locações
    private static List<models.Locacao.Locar> tabelalocacoes;

    public static List<Usuario> getTabelacliente() {
        return tabelacliente;
    }

    public static List<Usuario> getTabelafuncionario() {
        return tabelafuncionario;
    }

    public static List<Veiculo> getTabelaveiculos() {
        return tabelaveiculos;
    }

    public static List<Locar> getTabelalocacoes() {
        return tabelalocacoes;
    }
    public static void LaunchDB(){
        tabelacliente = new ArrayList<Usuario>();
        tabelafuncionario = new ArrayList<Usuario>();
        tabelaveiculos = new ArrayList<Veiculo>();
        tabelalocacoes = new ArrayList<Locar>();
    }
}
