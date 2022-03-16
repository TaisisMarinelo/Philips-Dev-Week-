package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.Regiao;
import com.dio_class.devweek.Repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerRegiao {

    @Autowired
    private RegiaoRepository repository;


    @GetMapping("/regioes")
    public ResponseEntity<?> findAllRegioes(){
        try{
            List<Regiao> allRegioes = repository.findAll();
            if (allRegioes.isEmpty()){
                System.out.println("Vazia");
            }
            return new ResponseEntity<>(allRegioes, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/regioes/{id}")
    public ResponseEntity<Regiao> findRegioesById(@PathVariable Long id){
        Optional<Regiao> regiaoOptional = repository.findById(id);
       try {
           if (regiaoOptional.isPresent()){
               Regiao regiao = regiaoOptional.get();
               return  new ResponseEntity<>(regiao, HttpStatus.OK);
           }
       }catch (Exception e){
           e.printStackTrace();
       }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("regioes/insert")
    public ResponseEntity<Regiao> postRegiao(@RequestBody Regiao regiao){
        repository.save(regiao);
        return new ResponseEntity<>(regiao,HttpStatus.OK);

    }

    @DeleteMapping("/regioes/delete/{id}")
    public ResponseEntity deleteRegiao(@PathVariable Long id){
        repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
