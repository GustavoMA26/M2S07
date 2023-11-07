package tech.devinhouse.veiculos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "VEICULOS")
public class Veiculo {

    @Id
    private String placa;

    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;

    private String nome;

    private Integer anoFabricacao;

    private String cor;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "veiculo")
    private List<Multa> multas;


    public Veiculo() {
    }

    public Veiculo(String placa, TipoVeiculo tipoVeiculo, String nome, Integer anoFabricacao, String cor) {
        this(placa, tipoVeiculo, nome, anoFabricacao, cor, null);
    }

    public Veiculo(String placa, TipoVeiculo tipoVeiculo, String nome, Integer anoFabricacao, String cor, List<Multa> multas) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.multas = multas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Multa> getMultas() {
        return multas;
    }

    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }
}
