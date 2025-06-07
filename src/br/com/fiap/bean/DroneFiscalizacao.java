package br.com.fiap.bean;

/**
 * Classe que representa um drone utilizado para fiscalização ambiental.
 * Herda os atributos da superclasse Drone e acrescenta a quantidade de fotos tiradas.
 * O custo da missão aumenta proporcionalmente ao número de fotos.
 *
 * @author Fernando
 */
public class DroneFiscalizacao extends Drone {

    // Atributo específico
    private int quantidadeFotos;

    /**
     * Construtor vazio que inicializa os atributos com valores padrão.
     */
    public DroneFiscalizacao() {
        super();
    }

    /**
     * Construtor com parâmetros que inicializa os atributos com os valores informados.
     *
     * @param id Identificador do drone
     * @param modelo Modelo do drone
     * @param horasVoo Quantidade de horas voadas
     * @param areaMonitorada Área monitorada pelo drone (em hectares)
     * @param custoBase Custo base da operação
     * @param quantidadeFotos Número de fotos tiradas durante a fiscalização
     */
    public DroneFiscalizacao(String id, String modelo, double horasVoo, double areaMonitorada, double custoBase, int quantidadeFotos) {
        super(id, modelo, horasVoo, areaMonitorada, custoBase);
        this.quantidadeFotos = quantidadeFotos;
    }

    /**
     * Retorna a quantidade de fotos tiradas pelo drone.
     *
     * @return int quantidade de fotos
     */
    public int getQuantidadeFotos() {
        return quantidadeFotos;
    }

    /**
     * Define a quantidade de fotos tiradas durante a missão de fiscalização.
     *
     * @param quantidadeFotos Número de fotos
     */
    public void setQuantidadeFotos(int quantidadeFotos) {
        this.quantidadeFotos = quantidadeFotos;
    }

    /**
     * Metodo sobrescrito que calcula o custo total da missão
     * com base no custo base e no número de fotos tiradas.
     *
     * @return double custo total da operação
     */
    @Override
    public double calcularCusto() {
        return getCustoBase() + (quantidadeFotos * 0.2);
    }
}
