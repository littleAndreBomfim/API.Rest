package API.Rest.service;

import API.Rest.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
