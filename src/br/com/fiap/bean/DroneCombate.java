package br.com.fiap.bean;

public class DroneCombate extends Drone {

    // Atributo específico
    private double litrosAgua;

    // Construtor vazio
    public DroneCombate() {
        super();
    }

    // Construtor com parâmetros
    public DroneCombate(String id, String modelo, double horasVoo, double areaMonitorada, double custoBase, double litrosAgua) {
        super(id, modelo, horasVoo, areaMonitorada, custoBase);
        this.litrosAgua = litrosAgua;
    }

    // Getter e Setter
    public double getLitrosAgua() {
        return litrosAgua;
    }

    public void setLitrosAgua(double litrosAgua) {
        this.litrosAgua = litrosAgua;
    }

    // Cálculo do custo: custo base + R$ 0.50 por litro de água utilizado.
    public double calcularCusto() {
        return getCustoBase() + (litrosAgua * 0.5);
    }
}
