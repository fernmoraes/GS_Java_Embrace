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
    public void setId(String id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
}
