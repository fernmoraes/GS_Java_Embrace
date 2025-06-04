package br.com.fiap.main;

import br.com.fiap.bean.*;
import javax.swing.JOptionPane;

/**
 * Classe principal para execução do sistema FireDrone Manager.
 * Interage com o usuário para calcular os custos de operação dos drones.
 * Usa JOptionPane para entrada e saída de dados conforme ensinado em aula.
 */
public class Main {

    public static void main(String[] args) {
        int opcao;
        do {
            // Menu principal
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "🔥 FireDrone Manager 🔥\n\n" +
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
                    dm.setHorasVoo(Double.parseDouble(JOptionPane.showInputDialog("Horas de voo:")));
                    dm.setAreaMonitorada(Double.parseDouble(JOptionPane.showInputDialog("Área monitorada (ha):")));
                    dm.setCustoBase(Double.parseDouble(JOptionPane.showInputDialog("Custo base da operação (R$):")));

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
                    dc.setHorasVoo(Double.parseDouble(JOptionPane.showInputDialog("Horas de voo:")));
                    dc.setAreaMonitorada(Double.parseDouble(JOptionPane.showInputDialog("Área monitorada (ha):")));
                    dc.setCustoBase(Double.parseDouble(JOptionPane.showInputDialog("Custo base da operação (R$):")));
                    dc.setLitrosAgua(Double.parseDouble(JOptionPane.showInputDialog("Litros de água usados:")));

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
                    df.setHorasVoo(Double.parseDouble(JOptionPane.showInputDialog("Horas de voo:")));
                    df.setAreaMonitorada(Double.parseDouble(JOptionPane.showInputDialog("Área monitorada (ha):")));
                    df.setCustoBase(Double.parseDouble(JOptionPane.showInputDialog("Custo base da operação (R$):")));
                    df.setQuantidadeFotos(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de fotos tiradas:")));

                    JOptionPane.showMessageDialog(null,
                            "Resumo da Missão:\n" +
                                    "Modelo: " + df.getModelo() + "\n" +
                                    "Fotos Tiradas: " + df.getQuantidadeFotos() + "\n" +
                                    "Custo Total: R$ " + df.calcularCusto()
                    );
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema. Obrigado por usar o FireDrone Manager! 👋");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 4);
    }
}
