package com.gpads.moringa.entities;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.text.SimpleDateFormat;

@Entity
public class PlacaOutPut {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private Date dataHora;
    private float temperatura;
    private float umidade;
    private float pressao;
    private float luminosidade;
    private float cO2;
    private float qualidadeDoAr;
    private float velocidadeDoVento;
    private float voltagem;
    private float rpm;

    @ManyToOne
    @JoinColumn(nullable = false, name = "placa_id")
    private Placa placa;

    public PlacaOutPut(){}

    
    public PlacaOutPut(Date dataHora, float temperatura, float umidade, float pressao, float luminosidade, float cO2,
            float qualidadeDoAr, float velocidadeDoVento, float voltagem, float rpm, Placa placa) {
        this.dataHora = dataHora;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.luminosidade = luminosidade;
        this.cO2 = cO2;
        this.qualidadeDoAr = qualidadeDoAr;
        this.velocidadeDoVento = velocidadeDoVento;
        this.voltagem = voltagem;
        this.rpm = rpm;
        this.placa = placa;
    }
    public Date getDataHora() {
        return dataHora;
    }
    public String getDataHoraString(){
        return new SimpleDateFormat("HH:mm dd/MM/yyyy").format(this.dataHora);
    }
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    public float getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    public float getUmidade() {
        return umidade;
    }
    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }
    public float getPressao() {
        return pressao;
    }
    public void setPressao(float pressao) {
        this.pressao = pressao;
    }
    public float getLuminosidade() {
        return luminosidade;
    }
    public void setLuminosidade(float luminosidade) {
        this.luminosidade = luminosidade;
    }
    public float getcO2() {
        return cO2;
    }
    public void setcO2(float cO2) {
        this.cO2 = cO2;
    }
    public float getQualidadeDoAr() {
        return qualidadeDoAr;
    }
    public void setQualidadeDoAr(float qualidadeDoAr) {
        this.qualidadeDoAr = qualidadeDoAr;
    }
    public float getVelocidadeDoVento() {
        return velocidadeDoVento;
    }
    public void setVelocidadeDoVento(float velocidadeDoVento) {
        this.velocidadeDoVento = velocidadeDoVento;
    }
    public float getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }
    public float getRpm() {
        return rpm;
    }
    public void setRpm(float rpm) {
        this.rpm = rpm;
    }
    public Placa getPlaca() {
        return placa;
    }
    public void setPlaca(Placa placa) {
        this.placa = placa;
    }
    
}
