package br.com.bootwhats.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bootwhats.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
