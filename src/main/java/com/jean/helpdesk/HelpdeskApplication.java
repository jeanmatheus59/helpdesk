package com.jean.helpdesk;

import com.jean.helpdesk.domain.*;
import com.jean.helpdesk.repository.ChamadoRepository;
import com.jean.helpdesk.repository.ClienteRepository;
import com.jean.helpdesk.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelpdeskApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

}
