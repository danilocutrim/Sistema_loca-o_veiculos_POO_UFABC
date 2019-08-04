package controllers;

import db.Db;
import java.util.Scanner;

import models.veiculos.Moto;
import models.veiculos.Veiculo;


public abstract class MotoController {
    private static Scanner leitor = new Scanner(System.in);
    public static void CadastrarMoto(){


            System.out.println("informe o modelo: ");
            String modeloVan = leitor.nextLine();

            System.out.println("informe a marca: ");
            String marcaVan = leitor.nextLine();

            System.out.println("informe o ano: ");
            int anoVan = leitor.nextInt();
            leitor.nextLine();

            System.out.println("informe o valor: ");
            int valorMoto = leitor.nextInt();

            leitor.nextLine();
            Moto moto = new Moto();
            
            Veiculo.setCodigo_tot(Veiculo.getCodigo_tot() +1);
            moto.setCodigo(Veiculo.getCodigo_tot());

            moto.setAno(anoVan);

            moto.setModelo(modeloVan);

            moto.setMarca(marcaVan);

            moto.setValores(valorMoto);
            moto.setTipo("Moto");

            Db.getTabelaveiculos().add(moto);

    }

}
