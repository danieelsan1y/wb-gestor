package br.com.dagosolutions.WBGestor;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.enums.Alma;
import br.com.dagosolutions.WBGestor.model.enums.Tamanho;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.time.LocalDate;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class WbGestorApplication {

	public static void main(String[] args) {
		ModeloArma modeloArma = new ModeloArma(Tamanho.CURTA,2, Alma.LISA,".40",20,"Taurus","G2C","Brasil",5.500);
		Arma arma = new Arma("0987620","Branco",modeloArma);

		System.out.println(arma);
		SpringApplication.run(WbGestorApplication.class, args);
	}
}
