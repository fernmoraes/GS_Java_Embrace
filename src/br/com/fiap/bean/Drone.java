package br.com.fiap.bean;

/**
 * Classe base que representa um drone genérico utilizado em missões de combate às queimadas.
 * Contém atributos comuns a todos os tipos de drone e métodos para manipulação e cálculo de custo.
 * Esta classe pode ser estendida por tipos específicos de drone.
 *
 * @author Fernando
 */
public class Drone {

    // Atributos encapsulados
    private String id;
    private String modelo;
    private double horasVoo;
    private double areaMonitorada;
    private double custoBase;

    /**
     * Construtor vazio da classe Drone.
     * Inicializa os atributos com valores padrão.
     */
    public Drone() {}

    /**
     * Construtor com passagem de parâmetros para inicializar o objeto Drone.
     *
     * @param id Identificador do drone
     * @param modelo Modelo do drone
     * @param horasVoo Quantidade de horas voadas
     * @param areaMonitorada Área monitorada em hectares
     * @param custoBase Custo base da operação
     */
    public Drone(String id, String modelo, double horasVoo, double areaMonitorada, double custoBase) {
        this.id = id;
        this.modelo = modelo;
        this.horasVoo = horasVoo;
        this.areaMonitorada = areaMonitorada;
        this.custoBase = custoBase;
    }

    /**
     * Define o identificador do drone.
     * @param id Identificador único
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retorna o modelo do drone.
     * @return String com o modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo do drone.
     * @param modelo Nome ou código do modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Define as horas de voo realizadas pelo drone.
     * @param horasVoo Quantidade de horas
     */
    public void setHorasVoo(double horasVoo) {
        this.horasVoo = horasVoo;
    }

    /**
     * Retorna a área monitorada pela missão do drone.
     * @return double com a área em hectares
     */
    public double getAreaMonitorada() {
        return areaMonitorada;
    }

    /**
     * Define a área monitorada pela missão.
     * @param areaMonitorada Valor em hectares
     */
    public void setAreaMonitorada(double areaMonitorada) {
        this.areaMonitorada = areaMonitorada;
    }

    /**
     * Retorna o custo base da missão.
     * @return double com o custo base
     */
    public double getCustoBase() {
        return custoBase;
    }

    /**
     * Define o custo base da operação.
     * @param custoBase Valor em reais
     */
    public void setCustoBase(double custoBase) {
        this.custoBase = custoBase;
    }

    /**
     * Metodo que calcula o custo total da operação do drone.
     * Este metodo pode ser sobrescrito por subclasses.
     *
     * @return double custo total da missão
     */
    public double calcularCusto() {
        return custoBase;
    }
}
