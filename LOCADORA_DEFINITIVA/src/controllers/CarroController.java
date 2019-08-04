package controllers;

import db.Db;
import models.veiculos.Carro;
import models.veiculos.Veiculo;

import java.util.Scanner;

public abstract class CarroController{
    private static Scanner leitor = new Scanner(System.in);

    public static void CadastrarCarro(){

        System.out.println("informe o ano do carro: ");
        int anoCarro = leitor.nextInt();
        leitor.nextLine();

        System.out.println("informe o modelo:");
        String modelocarro = leitor.nextLine();

        System.out.println("informe a marca do carro :");
        String marcaCarro = leitor.nextLine();

        System.out.println("informe o valor do carro : ");
        int valorcarro = leitor.nextInt();
        leitor.nextLine();

        System.out.println("tem ar condicionado: ");
        boolean arCarro = leitor.nextBoolean();

        System.out.println("tem direcao: ");
        boolean dirCarro = leitor.nextBoolean();

        Carro car = new Carro();
        Veiculo.setCodigo_tot(Veiculo.getCodigo_tot() +1);
        car.setCodigo(Veiculo.getCodigo_tot());
        car.setAno(anoCarro);
        car.setModelo(modelocarro);
        car.setMarca(marcaCarro);
        car.setValores(valorcarro);
        car.setAr(arCarro);
        car.setDirecaoHidraulica(dirCarro);
        car.setTipo("Carro");
        Db.getTabelaveiculos().add(car);
    }

    public static Veiculo PesquisarCarroPorCodigo(int codCarro)
    {

        for(Veiculo car : Db.getTabelaveiculos())
        {
            if(car.getCodigo() == codCarro)
            {
                return car;
            }
        }
        return null;
    }

}