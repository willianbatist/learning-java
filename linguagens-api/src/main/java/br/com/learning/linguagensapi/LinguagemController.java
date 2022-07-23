package br.com.learning.linguagensapi;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LinguagemController {

    @GetMapping("/hello")
    public String getMethodName() {
      return "hello Java, willian";
    }

    @Autowired
    private LinguagemRepository repository;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {
      List<Linguagem> linguagens = repository.findAll();
      return linguagens;
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
      Linguagem linguagemSalva = repository.save(linguagem);
      return linguagemSalva;
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletePost(@PathVariable("id") String id) {
      repository.deleteById(id);
    }
}
