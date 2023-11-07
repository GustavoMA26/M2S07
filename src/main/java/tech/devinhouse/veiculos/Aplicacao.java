package tech.devinhouse.veiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.devinhouse.veiculos.model.TipoVeiculo;
import tech.devinhouse.veiculos.model.Veiculo;
import tech.devinhouse.veiculos.repository.VeiculoRepository;

@Component
public class Aplicacao {

    @Autowired
    private VeiculoRepository veiculoRepository;
    public void executar() {

        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.AUTOMOVEL, "Bat-Movel", 2022, "preto");
        Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculo.ONIBUS, "Enterprise", 1960, "prata");

        veiculoRepository.save(veiculo1);
        veiculoRepository.save(veiculo2);
    }

}
