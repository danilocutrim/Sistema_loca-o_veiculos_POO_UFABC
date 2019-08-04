package controllers;

import db.Db;
import java.util.Scanner;

import models.veiculos.Moto;


public class MotoController {
    private static Scanner leitor;
    public static void CadastrarMoto(){
            System.out.println("Informe o codigo: ");
            int codVan = leitor.nextInt();
            leitor.nextLine();

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

            moto.setCodigo(codVan);

            moto.setAno(anoVan);

            moto.setModelo(modeloVan);

            moto.setMarca(marcaVan);

            moto.setValores(valorMoto);

            Db.getTabelaveiculos().add(moto);

    }

}
