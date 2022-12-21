package com.jean.helpdesk.services;

import com.jean.helpdesk.domain.*;
import com.jean.helpdesk.repository.ChamadoRepository;
import com.jean.helpdesk.repository.ClienteRepository;
import com.jean.helpdesk.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DbService {
    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaDb() {
        Tecnico tec1 = new Tecnico(null, "Valdir cezar", "07708075009", "valdir@mail.com", "123");
        tec1.addPerfil(Perfil.ADMIN);
        Cliente cli1 = new Cliente(null, "Linus Torvalds", "37835021013", "torvalds@mail.com", "123");
        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
