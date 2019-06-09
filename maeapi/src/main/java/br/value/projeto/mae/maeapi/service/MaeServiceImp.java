package br.value.projeto.mae.maeapi.service;

import br.value.projeto.mae.maeapi.model.Mae;
import br.value.projeto.mae.maeapi.repository.MaeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaeServiceImp implements MaeServices {

    @Autowired
    private MaeRepository repository;

    @Override
    public List<Mae> listar() {
        return repository.findAll();
    }

    @Override
    public Mae listarId(long id) {
        return null;
    }

    @Override
    public Mae add(Mae mae) {
        return null;
    }

    @Override
    public Mae editar(Mae mae) {
        return null;
    }

    @Override
    public Mae deletar(long id) {
        return null;
    }
}
