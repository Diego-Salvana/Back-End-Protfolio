
package com.AP.Portfolio.Repository;

import com.AP.Portfolio.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioReposotory extends JpaRepository<Usuario, Long> {
    
}
