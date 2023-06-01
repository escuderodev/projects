package br.com.escuderodev.kfeitariafit.controller;

import br.com.escuderodev.kfeitariafit.models.customer.Customer;
import br.com.escuderodev.kfeitariafit.models.customer.CustomerRegistrationData;
import br.com.escuderodev.kfeitariafit.models.customer.CustomerRepository;
import br.com.escuderodev.kfeitariafit.models.customer.CustomerUpdateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/formulario")
    public String loadFormPage(Long idcliente, Model model) {
        if (idcliente != null) {
            var customer = repository.getReferenceById(idcliente);
            model.addAttribute("cliente", customer);
        }
        return "customer/formulario";
    }

    @GetMapping
    public String loadListPage(Model model) {
        model.addAttribute("cliente", repository.findAll());
        return "customer/listagem";
    }

    @PostMapping
    @Transactional
    public String customerRegistration(CustomerRegistrationData data) {
        var customer = new Customer(data);
        repository.save(customer);

        return "redirect:/clientes";
    }

    @PutMapping
    @Transactional
    public String customerUpdate(CustomerUpdateData data) {
        var customer = repository.getReferenceById(data.idcliente());
        customer.updateData(data);

        return "redirect:/clientes";
    }

    @DeleteMapping
    @Transactional
    public String customerRemove(Long idcliente) {
        repository.deleteById(idcliente);

        return "redirect:/clientes";
    }

}
