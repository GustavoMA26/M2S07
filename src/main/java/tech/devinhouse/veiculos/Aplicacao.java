package tech.devinhouse.veiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.devinhouse.veiculos.model.Multa;
import tech.devinhouse.veiculos.model.TipoVeiculo;
import tech.devinhouse.veiculos.model.Veiculo;
import tech.devinhouse.veiculos.repository.MultaRepository;
import tech.devinhouse.veiculos.repository.VeiculoRepository;

import java.util.List;

@Component
public class Aplicacao {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private MultaRepository multaRepo;
    public void executar() {

        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.AUTOMOVEL, "Bat-Movel", 2022, "preto");
        Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculo.ONIBUS, "Enterprise", 1960, "prata");

        veiculoRepository.save(veiculo1);
        veiculoRepository.save(veiculo2);

        Multa multa1 = new Multa("Gothan City", "Farol apagado", 250F, veiculo1);
        Multa multa2 = new Multa("Gothan City", "Insulfilm", 100F, veiculo1);
        Multa multa3 = new Multa("Hiper-espaço", "Excesso velocidade", 400F, veiculo2);

        multaRepo.save(multa1);
        multaRepo.save(multa2);
        multaRepo.save(multa3);

        multa3.setValor(380F);
        multaRepo.save(multa3);

        List<Veiculo> veiculos = veiculoRepository.findAll();
        for(Veiculo veiculo : veiculos){
            System.out.println(veiculo);
        }

    }

}
