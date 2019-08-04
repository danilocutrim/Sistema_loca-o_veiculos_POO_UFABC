package views;

import controllers.CarroController;
import db.Db;
import models.veiculos.Veiculo;

import java.util.Scanner;

public class VeiculoView {
    private static Scanner leitor = new Scanner(System.in);

    public static void ExibirVeiculos(){
        System.out.println("###Lista de veiculos cadastrados**");
        for(Veiculo veic : Db.getTabelaveiculos()){
            System.out.println("Código: " + veic.getCodigo());
            System.out.println("Modelo:" + veic.getValores());
            System.out.println("Ano: " + veic.getAno());
            System.out.println("Valor: " + veic.getValores());
        }
    }
    public static void ExibirVeiculoPorCodigo(){
        System.out.println("#######");
        System.out.println("###Exibir por codigo###");
        System.out.println("Informe o código");
        int codveic = leitor.nextInt();
        leitor.nextLine();

        Veiculo veicu = CarroController.PesquisarCarroPorCodigo(codveic);
        if (veicu != null) {
            for( Veiculo c : Db.getTabelaveiculos()){
                if(c.getCodigo() == veicu.getCodigo()){
                    System.out.println("Código: " + veicu.getCodigo());
                    System.out.println("Modelo:" + veicu.getValores());
                    System.out.println("Ano: " + veicu.getAno());
                    System.out.println("Valor: " + veicu.getValores());
                    System.out.println("Tipo:"+ veicu.getTipo());
                }
            }
        } else{
            System.out.println("veiculo não cadastrado");
        }

    }

}
