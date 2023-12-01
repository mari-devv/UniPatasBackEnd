package com.example.demo.service;

import com.example.demo.dto.RegisterUserRequestDTO;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroService {

    private final UsuarioRepository usuarioRepository;

    public void cadastrarUsuario(RegisterUserRequestDTO request) {

        final Usuario usuarioToSave = Usuario
                .builder()
                .nome(request.getNome())
                .email(request.getEmail())
                .senha(request.getSenha())
                .cpf(request.getCpf())
                .login(request.getLogin())
                .larTemporario(request.getLarTemporario())
                .opcoesDeContato(request.getOpcoesDeContato())
                .telefone(request.getTelefone())
                .build();

        final Usuario save = usuarioRepository.save(usuarioToSave);

    }

}
