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
}
