package com.dio_class.devweek.Controller;


import com.dio_class.devweek.Entity.IncidenciaExame;
import com.dio_class.devweek.Repository.IncidenciaExameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerIncidenciaExame {

    @Autowired
    private IncidenciaExameRepository repository;

    @GetMapping("/ocorrencias")
    public ResponseEntity<?>  findAllOcorrencias(){
        try {
            List<IncidenciaExame> allExames = repository.findAll();
            return new ResponseEntity<>(allExames,HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/ocorrencias/{id}")
    public ResponseEntity<IncidenciaExame> findOcorrenciaById(@PathVariable Long id){
        Optional<IncidenciaExame> optionalIncidenciaExame = repository.findById(id);
        try {
            if(optionalIncidenciaExame.isPresent()){
                IncidenciaExame ocorrencia = optionalIncidenciaExame.get();
                return new ResponseEntity<>(ocorrencia, HttpStatus.OK);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/ocorrencias/insert")
    public ResponseEntity postIncidenciaExame(@RequestBody IncidenciaExame incidenciaExame){
        repository.save(incidenciaExame);
        return new ResponseEntity<>(incidenciaExame, HttpStatus.OK);
    }

    @DeleteMapping("/ocorrencias/delete/{id}")
    public ResponseEntity deleteIncidenciaExame(@PathVariable Long id){
        repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
