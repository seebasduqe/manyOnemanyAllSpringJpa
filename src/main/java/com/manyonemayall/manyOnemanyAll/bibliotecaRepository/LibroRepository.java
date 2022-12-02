package com.manyonemayall.manyOnemanyAll.bibliotecaRepository;

import com.manyonemayall.manyOnemanyAll.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository  <Libro, Integer>{
}
