package com.example.demo.controller;

import com.example.demo.dto.RegisterUserRequestDTO;
import com.example.demo.service.CadastroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class CadastroController {

    private final CadastroService CadastroService;

    @PostMapping("/cadastro")
    public void storeUser(@RequestBody RegisterUserRequestDTO request) {

        CadastroService.cadastrarUsuario(request);

    }



    @GetMapping("/teste")
    public String getTeste() {
        return "oi";
    }

}
