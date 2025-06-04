package br.com.fiap.main;

import br.com.fiap.bean.*;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcao;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(
                        "FireDrone Manager\n" +
                                "1 - Drone de Monitoramento\n" +
                                "2 - Drone de Combate\n" +
                                "3 - Drone de Fiscalização\n" +
                                "4 - Sair\n\n" +
                                "Escolha o tipo de drone:"
                ));

                switch (opcao) {
                    case 1:
                        DroneMonitoramento dm = new DroneMonitoramento();
                        dm.setId(JOptionPane.showInputDialog("ID do drone:"));
                        dm.setModelo(JOptionPane.showInputDialog("Modelo do drone:"));
                        dm.setHorasVoo(lerDouble("Horas de voo:"));
                        dm.setAreaMonitorada(lerDouble("Área monitorada (ha):"));
                        dm.setCustoBase(lerDouble("Custo base da operação (R$):"));

                        JOptionPane.showMessageDialog(null,
                                "Resumo da Missão:\n" +
                                        "Modelo: " + dm.getModelo() + "\n" +
                                        "Área Monitorada: " + dm.getAreaMonitorada() + " ha\n" +
                                        "Custo Total: R$ " + dm.calcularCusto()
                        );
                        break;

                    case 2:
                        DroneCombate dc = new DroneCombate();
                        dc.setId(JOptionPane.showInputDialog("ID do drone:"));
                        dc.setModelo(JOptionPane.showInputDialog("Modelo do drone:"));
                        dc.setHorasVoo(lerDouble("Horas de voo:"));
                        dc.setAreaMonitorada(lerDouble("Área monitorada (ha):"));
                        dc.setCustoBase(lerDouble("Custo base da operação (R$):"));
                        dc.setLitrosAgua(lerDouble("Litros de água usados:"));

                        JOptionPane.showMessageDialog(null,
                                "Resumo da Missão:\n" +
                                        "Modelo: " + dc.getModelo() + "\n" +
                                        "Água Utilizada: " + dc.getLitrosAgua() + " L\n" +
                                        "Custo Total: R$ " + dc.calcularCusto()
                        );
                        break;

                    case 3:
                        DroneFiscalizacao df = new DroneFiscalizacao();
                        df.setId(JOptionPane.showInputDialog("ID do drone:"));
                        df.setModelo(JOptionPane.showInputDialog("Modelo do drone:"));
                        df.setHorasVoo(lerDouble("Horas de voo:"));
                        df.setAreaMonitorada(lerDouble("Área monitorada (ha):"));
                        df.setCustoBase(lerDouble("Custo base da operação (R$):"));
                        df.setQuantidadeFotos(lerInt("Quantidade de fotos tiradas:"));

                        JOptionPane.showMessageDialog(null,
                                "Resumo da Missão:\n" +
                                        "Modelo: " + df.getModelo() + "\n" +
                                        "Fotos Tiradas: " + df.getQuantidadeFotos() + "\n" +
                                        "Custo Total: R$ " + df.calcularCusto()
                        );
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                        break;
                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro na entrada de dados. Tente novamente.");
                opcao = 0; // força repetir
            }

        } while (opcao != 4);
    }

    // Metodo utilitario para ler Double com validação
    public static double lerDouble(String mensagem) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }
    }

    // Metodo utilitario para ler Integer com validação
    public static int lerInt(String mensagem) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro válido!");
            }
        }
    }
}
