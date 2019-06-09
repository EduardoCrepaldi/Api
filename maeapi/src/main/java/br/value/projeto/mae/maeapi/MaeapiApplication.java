package br.value.projeto.mae.maeapi;

import br.value.projeto.mae.maeapi.model.Mae;
import br.value.projeto.mae.maeapi.service.MaeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;

@SpringBootApplication
public class MaeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaeapiApplication.class, args);
	}


//	@Bean
//	CommandLineRunner init(MaeService service) {
//		return args -> {
//			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//				Mae mae = new Mae(name,"TEste",2,true);
//				service.incluirMae(mae);
//			});
//			service.buscarMaes().forEach(System.out::println);
//		};
//	}
}
