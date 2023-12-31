package com.dan.br.cadastrodefuncionario.service;

import java.util.List;

import com.dan.br.cadastrodefuncionario.DTO.FuncionarioDTO;
import com.dan.br.cadastrodefuncionario.model.Funcionario;

public interface FuncionarioService {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario) throws Exception;

    void delete(Long id) throws Exception;

    Funcionario findById(Long id) throws Exception;

    List<FuncionarioDTO> findAll() throws Exception;

    List<Funcionario> findByName(String nome) throws Exception;

    List<Funcionario> findByCargo(Long id) throws Exception;

}
