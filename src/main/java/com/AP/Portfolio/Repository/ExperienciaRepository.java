
package com.AP.Portfolio.Repository;

import com.AP.Portfolio.Model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<ExperienciaLaboral, Integer>{
    
}
