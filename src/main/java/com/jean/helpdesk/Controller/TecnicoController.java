package com.jean.helpdesk.Controller;

import com.jean.helpdesk.Dto.TecnicoDTO;
import com.jean.helpdesk.domain.Tecnico;
import com.jean.helpdesk.services.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tecnicos")
public class TecnicoController {
    @Autowired
    private TecnicoService tecnicoService;
    @GetMapping("/{id}")
    public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id) {
        Tecnico obj = tecnicoService.findById(id);
        return ResponseEntity.ok().body(new TecnicoDTO(obj));
    }

}
