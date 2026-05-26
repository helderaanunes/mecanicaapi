package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.dtos.DadosAutenticacao;
import br.edu.ifpe.mecanica.entities.Usuario;
import br.edu.ifpe.mecanica.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados) {
        // 1. Cria um token interno do Spring com o email e senha recebidos
        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.email(), dados.senha());
        // 2. O Manager chama o AutenticacaoService para verificar as credenciais no banco
        var authentication = manager.authenticate(authenticationToken);
        // 3. Se estiver correto, gera o Token JWT para o usuário
        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());
        // 4. Retorna o token no corpo da resposta
        return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }

    // Record auxiliar para devolver o JSON estruturado: {"token": "..."}
    private record DadosTokenJWT(String token) {}
}