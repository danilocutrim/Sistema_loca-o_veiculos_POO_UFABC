package controllers;

import db.Db;
import java.util.Scanner;
import models.veiculos.Van;

public class VanControllers {
    private static Scanner leitor;

    static {
        leitor = new Scanner(System.in);
    }

    public VanControllers() {
    }

    public static void CadastrarCarro() {

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
        int valorVan = leitor.nextInt();

        leitor.nextLine();
        Van van = new Van();

        van.setCodigo(codVan);

        van.setAno(anoVan);

        van.setModelo(modeloVan);

        van.setMarca(marcaVan);

        van.setValores((float)valorVan);

        Db.getTabelaveiculos().add(van);
    }
}
