package br.com.fiap.bean;

public class DroneFiscalizacao extends Drone {

    // Atributo específico
    private int quantidadeFotos;

    // Construtor vazio
    public DroneFiscalizacao() {
        super();
    }

    // Construtor com parâmetros
    public DroneFiscalizacao(String id, String modelo, double horasVoo, double areaMonitorada, double custoBase, int quantidadeFotos) {
        super(id, modelo, horasVoo, areaMonitorada, custoBase);
        this.quantidadeFotos = quantidadeFotos;
    }

    // Getter e Setter
    public int getQuantidadeFotos() {
        return quantidadeFotos;
    }

    public void setQuantidadeFotos(int quantidadeFotos) {
        this.quantidadeFotos = quantidadeFotos;
    }

    // Calculo do custo: custo base + R$ 0,20 por foto tirada.
    public double calcularCusto() {
        return getCustoBase() + (quantidadeFotos * 0.2);
    }
}