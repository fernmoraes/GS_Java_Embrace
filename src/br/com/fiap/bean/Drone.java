package br.com.fiap.bean;

public class Drone {
    // Atributos encapsulados
    private String id;
    private String modelo;
    private double horasVoo;
    private double areaMonitorada;
    private double custoBase;

    // Construtor vazio
    public Drone() {}

    // Construtor com parâmetros
    public Drone(String id, String modelo, double horasVoo, double areaMonitorada, double custoBase) {
        this.id = id;
        this.modelo = modelo;
        this.horasVoo = horasVoo;
        this.areaMonitorada = areaMonitorada;
        this.custoBase = custoBase;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(double horasVoo) {
        this.horasVoo = horasVoo;
    }

    public double getAreaMonitorada() {
        return areaMonitorada;
    }

    public void setAreaMonitorada(double areaMonitorada) {
        this.areaMonitorada = areaMonitorada;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public void setCustoBase(double custoBase) {
        this.custoBase = custoBase;
    }

    //Metodo que calcula o custo da operação do drone.
    public double calcularCusto() {
        return custoBase;
    }

    //Metodo sobrecarregado para exibir o resumo da missão.
    public void mostrarResumo() {
        System.out.println("Drone: " + modelo + " | ID: " + id);
        System.out.println("Horas de Voo: " + horasVoo);
        System.out.println("Área Monitorada: " + areaMonitorada + " hectares");
        System.out.println("Custo Base: R$" + custoBase);
    }

    //Metodo sobrecarregado com mensagem personalizada.
    public void mostrarResumo(String mensagem) {
        System.out.println(mensagem);
        mostrarResumo();
    }
}
