package br.com.dagosolutions.WBGestor.test;

import br.com.dagosolutions.WBGestor.model.dto.ModeloArmaDTO;
import br.com.dagosolutions.WBGestor.service.ModeloArmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    @Autowired
    private ModeloArmaService modeloArmaService;

    @Override
    public void run(String... args) throws Exception {
        ModeloArmaDTO modeloArmaDTO = new ModeloArmaDTO("CURTA",4, "RAIADA",
                ".40",30,"TAURUS","G37","BRASIL",4000.0);
        


        //usuarioRepository.saveAll(Arrays.asList(user1, user2, user3, user4));

    }
}