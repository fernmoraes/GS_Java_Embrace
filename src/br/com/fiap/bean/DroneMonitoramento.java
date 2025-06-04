package br.com.fiap.bean;

public class DroneMonitoramento extends Drone {

    // Construtor vazio
    public DroneMonitoramento() {
        super();
    }

    // Construtor com parâmetros (herdando da superclasse)
    public DroneMonitoramento(String id, String modelo, double horasVoo, double areaMonitorada, double custoBase) {
        super(id, modelo, horasVoo, areaMonitorada, custoBase);
    }

    // Cálculo do custo: usa apenas o custo base do drone.
    public double calcularCusto() {
        return getCustoBase();
    }
}
