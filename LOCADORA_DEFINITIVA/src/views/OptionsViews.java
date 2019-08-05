package views;

import controllers.*;
import java.util.Scanner;

public abstract class OptionsViews {
    private static Scanner leitor = new Scanner(System.in);
    public static void MostrarMenu(){
        int option = 0;
        do{
            System.out.println("###Escolha uma opcao");
            System.out.println("1-Listar Veículos");
            System.out.println("2-Exibir  veiculos por codigo");
            System.out.println("3-Reservar Veículo");
            System.out.println("4-Cancelar Reserva de Veículo");
            System.out.println("5-Orcar Veículo");
            System.out.println("6-Sair");

       //     try{
                option = leitor.nextInt();
                switch (option){
                	case 1 :
                		VeiculoView.ExibirVeiculos();
                		break;
                    case 2 :
                        VeiculoView.ExibirVeiculoPorCodigo();
                        break;
                    
                    case 3:
                        LocacaoController.ReservarVeiculo();
                        break;
                    case 4:
                        LocacaoController.CancelarReservaVeiculo();
                        break;
                    case 5:
                        VeiculoView.Orcamento();
                        break;

                }
         /*   } catch (InputMismatchException e1){
                System.out.println("###Insira um numero válido");
                leitor.nextLine();
                */
            
        } while (option != 6);
        LoginView.Login();
    }
}
