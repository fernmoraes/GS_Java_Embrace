package br.com.fiap.bean;

/**
 * Classe que representa um drone utilizado para combate a incêndios florestais.
 * Possui atributo adicional referente à quantidade de água utilizada na missão.
 * Herda atributos e comportamentos da superclasse Drone.
 *
 * @author Fernando
 */
public class DroneCombate extends Drone {

    // Atributo específico
    private double litrosAgua;

    /**
     * Construtor vazio da classe DroneCombate.
     * Inicializa os atributos com valores padrão.
     */
    public DroneCombate() {
        super();
    }

    /**
     * Construtor com passagem de parâmetros para inicializar
     * um objeto DroneCombate com dados específicos.
     *
     * @param id Identificador do drone
     * @param modelo Modelo do drone
     * @param horasVoo Quantidade de horas voadas
     * @param areaMonitorada Área monitorada em hectares
     * @param custoBase Custo base da operação
     * @param litrosAgua Litros de água utilizados no combate
     */
    public DroneCombate(String id, String modelo, double horasVoo, double areaMonitorada, double custoBase, double litrosAgua) {
        super(id, modelo, horasVoo, areaMonitorada, custoBase);
        this.litrosAgua = litrosAgua;
    }

    /**
     * Retorna a quantidade de litros de água usada pelo drone.
     *
     * @return double quantidade de litros de água
     */
    public double getLitrosAgua() {
        return litrosAgua;
    }

    /**
     * Define a quantidade de litros de água utilizada na missão.
     *
     * @param litrosAgua Quantidade de litros de água
     */
    public void setLitrosAgua(double litrosAgua) {
        this.litrosAgua = litrosAgua;
    }

    /**
     * Metodo sobrescrito que calcula o custo total da operação
     * com base no custo base e na quantidade de água utilizada.
     *
     * @return double custo total da missão
     */
    @Override
    public double calcularCusto() {
        return getCustoBase() + (litrosAgua * 0.5);
    }
}
