package br.com.marcos.conversor;

import br.com.marcos.api.ConsultarMoeda;

import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        int opcao = -1;
        String moedaBase = "";
        String moedaTarget = "";
        String menu = """
                *************************************************************
                *           CONVERSOR DE MOEDAS - SEJA BEM VINDO!           *
                *                                                           *
                *            1) Dólar --> Peso Argentino                    *
                *            2) Peso Argentino --> Dólar                    *
                *            3) Dólar --> Real Brasileiro                   *
                *            4) Real Brasileiro --> Dólar                   *
                *            5) Dólar --> Peso Colombiano                   *
                *            6) Peso Colombiano --> Dólar                   *
                *            7) Sair                                        *
                *                                                           *
                *************************************************************
                """;

        while (opcao != 7) {
            System.out.println(menu.strip());
            System.out.print("Escolha uma Opção válida:");
            opcao = Integer.parseInt(leitura.nextLine());

            switch (opcao) {
                case 1: {
                    moedaBase = "USD";
                    moedaTarget = "ARS";
                    break;
                }
                case 2: {
                    moedaBase = "ARS";
                    moedaTarget = "USD";
                    break;
                }
                case 3: {
                    moedaBase = "USD";
                    moedaTarget = "BRL";
                    break;
                }
                case 4: {
                    moedaBase = "BRL";
                    moedaTarget = "USD";
                    break;
                }
                case 5: {
                    moedaBase = "USD";
                    moedaTarget = "COP";
                    break;
                }
                case 6: {
                    moedaBase = "COP";
                    moedaTarget = "USD";
                    break;
                }
                case 7: {
                    System.out.println("Encerrando o programa....");
                    break;
                }
                default: {
                    System.out.println("Opção Inválida!");
                }
            }
            if (opcao == 7) {break;}

            System.out.println("Digite o valor que deseja converter: ");
            double valor = Double.parseDouble(leitura.nextLine());

            var consulta = new ConsultarMoeda();

            if (!moedaBase.isEmpty()) {
                var resultado = consulta.consultarTaxa(moedaBase, moedaTarget, valor);
                System.out.printf("O valor de %.2f [%s] corresponde ao valor final de >>> %.2f [%s]%n",
                        valor, moedaBase, resultado.conversion_result(), moedaTarget);
            }
        }
    }
}
