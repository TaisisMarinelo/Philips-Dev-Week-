package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.FaixaEtaria;
import com.dio_class.devweek.Repository.FaixaEtariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerFaixaEtaria {

    @Autowired
    private FaixaEtariaRepository repository;


    @GetMapping("/faixa-etaria")
    public ResponseEntity<?> findAllFaixaEtaria(){
        try {
            List<FaixaEtaria> lista =  repository.findAll();
            return new ResponseEntity<>(lista,HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/faixa-etaria/{id}")
    public ResponseEntity<FaixaEtaria> findById(@PathVariable Long id){
        Optional<FaixaEtaria> faixaOptional = repository.findById(id);
      try {
          if(faixaOptional.isPresent()){
              FaixaEtaria faixaEtaria = faixaOptional.get();
              return  new ResponseEntity<>(faixaEtaria,HttpStatus.OK);
          }
      }catch (Exception e){
          e.printStackTrace();
      }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping("/faixa-etaria/insert")
    public ResponseEntity postFaixa(@RequestBody FaixaEtaria faixaEtaria){
        repository.save(faixaEtaria);
        return new ResponseEntity<>(faixaEtaria, HttpStatus.OK);
    }

    @DeleteMapping("/faixa-etaria/delete/{id}")
    public ResponseEntity deleteFaixa(@PathVariable Long id){
        repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
