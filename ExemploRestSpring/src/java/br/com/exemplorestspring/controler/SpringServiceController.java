package br.com.exemplorestspring.controler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/service/greeting")
public class SpringServiceController {

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public String getGreeting(@PathVariable String nome) {
        String result = "Ola " + nome;
        return result;
    }
}
