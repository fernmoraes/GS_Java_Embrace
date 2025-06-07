package br.com.fiap.bean;

/**
 * Classe que representa um drone utilizado para monitoramento ambiental.
 * Herda os atributos e métodos da superclasse Drone.
 * Utiliza apenas o custo base para cálculo de operação.
 *
 * @author Fernando
 */
public class DroneMonitoramento extends Drone {

    /**
     * Construtor vazio que inicializa um objeto DroneMonitoramento
     * com os valores padrões definidos na superclasse.
     */
    public DroneMonitoramento() {
        super();
    }

    /**
     * Construtor com passagem de parâmetros para inicializar
     * um objeto DroneMonitoramento com dados específicos.
     *
     * @param id Identificador do drone
     * @param modelo Modelo do drone
     * @param horasVoo Quantidade de horas voadas
     * @param areaMonitorada Área monitorada pelo drone (em hectares)
     * @param custoBase Custo base da operação do drone
     */
    public DroneMonitoramento(String id, String modelo, double horasVoo, double areaMonitorada, double custoBase) {
        super(id, modelo, horasVoo, areaMonitorada, custoBase);
    }

    /**
     * Metodo sobrescrito que calcula o custo total da operação
     * considerando apenas o custo base.
     *
     * @return double com o valor do custo total da missão
     */
    @Override
    public double calcularCusto() {
        return getCustoBase();
    }
}

