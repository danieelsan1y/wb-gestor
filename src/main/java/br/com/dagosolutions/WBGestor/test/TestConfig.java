package br.com.dagosolutions.WBGestor.test;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.enums.AlmaArma;
import br.com.dagosolutions.WBGestor.model.enums.TamanhoArma;
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

    @Override
    public void run(String... args) throws Exception {

        ModeloArma modeloArma = new ModeloArma(TamanhoArma.CURTA,4, AlmaArma.LISA,".40",20,"Taurus","G76","Brasil",40000.00 );
        ModeloArma modeloArma2 = new ModeloArma(TamanhoArma.LONGA,2, AlmaArma.RAIADA,".50",30,"Glock","M86","Uruguai",10000.00);
        modeloArmaRepository.saveAll(Arrays.asList(modeloArma,modeloArma2));

    }

}