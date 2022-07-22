package br.com.learning.linguagensapi;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LinguagemController {

    // private List<Linguagem> linguagens =
    //   List.of(
    //     new Linguagem("javaScript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png", 1),
    //     new Linguagem("typeScript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/typescript/typescript_256x256.png", 2)
    //   );

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
}
