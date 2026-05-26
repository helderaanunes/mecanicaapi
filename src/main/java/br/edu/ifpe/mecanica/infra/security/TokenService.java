package br.edu.ifpe.mecanica.infra.security;

import br.edu.ifpe.mecanica.entities.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class TokenService {

    // Essa chave deve ser secreta e configurada no seu application.properties
    @Value("${api.security.token.secret}")
    private String secret;

    public String gerarToken(Usuario usuario) {
        try {
            // Criamos uma chave a partir da string secreta
            Key key = Keys.hmacShaKeyFor(secret.getBytes());

            return Jwts.builder()
                    .setIssuer("API Mecanica") // Identifica quem gerou o token
                    .setSubject(usuario.getEmail()) // Guarda o email do usuário no corpo do token
                    .setIssuedAt(new Date()) // Data de geração
                    .setExpiration(gerarDataExpiracao()) // Data de validade
                    .signWith(key, SignatureAlgorithm.HS256) // Assinatura digital
                    .compact();
        } catch (Exception exception) {
            throw new RuntimeException("Erro ao gerar token jwt", exception);
        }
    }

    public String getSubject(String tokenJWT) {
        try {
            Key key = Keys.hmacShaKeyFor(secret.getBytes());
            return Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(tokenJWT)
                    .getBody()
                    .getSubject();
        } catch (Exception exception) {
            throw new RuntimeException("Token JWT inválido ou expirado!");
        }
    }

    private Date gerarDataExpiracao() {
        // Define a validade do token (Ex: 2 horas)
        return new Date(System.currentTimeMillis() + 2 * 60 * 60 * 1000);
    }
}