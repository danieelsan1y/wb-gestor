package br.com.dagosolutions.WBGestor.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.enums.AlmaArma;
import br.com.dagosolutions.WBGestor.model.enums.StatusArma;
import br.com.dagosolutions.WBGestor.model.enums.StatusCliente;
import br.com.dagosolutions.WBGestor.model.enums.TamanhoArma;
import br.com.dagosolutions.WBGestor.repository.ArmaRepository;
import br.com.dagosolutions.WBGestor.repository.ClienteRepository;
import br.com.dagosolutions.WBGestor.repository.ModeloArmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    @Autowired
    private ModeloArmaRepository modeloArmaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ArmaRepository armaRepository;

    @Override
    public void run(String... args) throws Exception {

        ModeloArma modeloArma = new ModeloArma(TamanhoArma.CURTA,4, AlmaArma.LISA,".40",20,"Taurus","G76","Brasil",40000.00 );
        ModeloArma modeloArma2 = new ModeloArma(TamanhoArma.LONGA,2, AlmaArma.RAIADA,".50",30,"Glock","M86","Uruguai",10000.00);
        modeloArmaRepository.saveAll(Arrays.asList(modeloArma,modeloArma2));

        Cliente cliente = new Cliente(null,"Daniel","70254147855",LocalDate.now(),"AV1234","959999","02255",LocalDate.now());
        cliente.setStatusCliente(StatusCliente.ATIVO);

        Arma arma = new Arma(null,"12345","PRETO", LocalDate.now(),LocalDate.now(), StatusArma.DISPONIVEL,modeloArma,cliente);
        Arma arma2 = new Arma(null,"15","ROSA",LocalDate.now(),null,StatusArma.DISPONIVEL,modeloArma,cliente);
        Arma arma3 = new Arma(null,"1aaa5","ROSasdsadsA",LocalDate.now(),null,StatusArma.DISPONIVEL,modeloArma,null);

        clienteRepository.save(cliente);
        armaRepository.saveAll(Arrays.asList(arma,arma2,arma3));

    }

}