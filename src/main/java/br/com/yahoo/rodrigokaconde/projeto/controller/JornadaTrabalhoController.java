package br.com.yahoo.rodrigokaconde.projeto.controller;

import br.com.yahoo.rodrigokaconde.projeto.model.JornadaTrabalho;
import br.com.yahoo.rodrigokaconde.projeto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaListById(@PathVariable("IdJornada")Long idJornada)
            throws Exception{
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada.")));
    }

    @PutMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> updateJornada(@PathVariable("idJornada") Long idJornada)
            throws Exception {
        JornadaTrabalho jornada = jornadaService.getById(idJornada)
                .orElseThrow(() -> new NoSuchElementException("Jornada não encontarda"));

        JornadaTrabalho jornadaModificada = jornadaService.updateJornada(jornada);
        return ResponseEntity.ok(jornadaModificada);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteById(@PathVariable("IdJornada")Long idJornada) throws Exception{
        try{
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
