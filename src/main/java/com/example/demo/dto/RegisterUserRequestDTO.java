package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequestDTO {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String login;
    private String senha;
    private Boolean opcoesDeContato;
    private Boolean larTemporario;

}