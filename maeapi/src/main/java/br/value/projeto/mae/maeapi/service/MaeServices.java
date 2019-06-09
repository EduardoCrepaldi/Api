package br.value.projeto.mae.maeapi.service;

import br.value.projeto.mae.maeapi.model.Mae;

import java.util.List;

public interface MaeServices {
    List<Mae> listar();
    Mae listarId(long id);
    Mae add(Mae mae);
    Mae editar(Mae mae);
    Mae deletar(long id);
}
