package tech.devinhouse.veiculos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MULTAS")
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String local;

    private String motivo;

    private Float valor;

    @ManyToOne
    @JoinColumn(name = "PLACA_VEICULO", referencedColumnName = "PLACA")
    private Veiculo veiculo;


    public Multa() {
    }

    public Multa(String local, String motivo, Float valor, Veiculo veiculo) {
        this.local = local;
        this.motivo = motivo;
        this.valor = valor;
        this.veiculo = veiculo;
    }


    @Override
    public String toString() {
        return "Multa{" +
                "id=" + id +
                ", local='" + local + '\'' +
                ", motivo='" + motivo + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
