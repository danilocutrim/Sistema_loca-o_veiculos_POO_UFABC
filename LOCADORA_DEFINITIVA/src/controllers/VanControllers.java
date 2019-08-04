package controllers;

import db.Db;
import java.util.Scanner;
import models.veiculos.Van;
import models.veiculos.Veiculo;

public abstract class VanControllers {
    private static Scanner leitor;

    static {
        leitor = new Scanner(System.in);
    }

    public VanControllers() {
    }

    public static void CadastrarVan() {

        System.out.println("informe o modelo: ");
        String modeloVan = leitor.nextLine();

        System.out.println("informe a marca: ");
        String marcaVan = leitor.nextLine();

        System.out.println("informe o ano: ");
        int anoVan = leitor.nextInt();
        leitor.nextLine();

        System.out.println("informe o valor: ");
        int valorVan = leitor.nextInt();

        leitor.nextLine();
        Van van = new Van();
        Veiculo.setCodigo_tot(Veiculo.getCodigo_tot() +1);
        van.setCodigo(Veiculo.getCodigo_tot());

        van.setAno(anoVan);

        van.setModelo(modeloVan);

        van.setMarca(marcaVan);

        van.setValores((float)valorVan);
        
        van.setTipo("Van");

        Db.getTabelaveiculos().add(van);
    }
}
