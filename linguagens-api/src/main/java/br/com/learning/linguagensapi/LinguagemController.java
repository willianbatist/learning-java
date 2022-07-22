package br.com.learning.linguagensapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @GetMapping(value="/linguagem")
    public String getMethodName() {
      return "hello Java, willian";
    }
}
