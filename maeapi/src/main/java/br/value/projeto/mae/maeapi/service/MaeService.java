package br.value.projeto.mae.maeapi.service;

import br.value.projeto.mae.maeapi.model.Mae;
import br.value.projeto.mae.maeapi.repository.MaeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaeService {

    private MaeRepository maeRepository;

    @Autowired
    public MaeService(MaeRepository maeRepository)
    {
        this.maeRepository = maeRepository;
    }


    public List<Mae> buscarMaes() {
        return maeRepository.findAll();
    }

    public Mae findById(Long id) {
        return maeRepository.findById(id).get();
    }

//    public String incluirMae(Mae mae) {
//
//        if(mae != null) {
//            mae = maeRepository.save(mae);
//
//        }else
//        {
//            return "Ocorreu um erro, não foi possivel cadastrar";
//        }
//
//        return "Cadastro Efetuado com Sucesso!";
//    }
    public Mae incluirMae(Mae mae) {

        if(mae != null) {
            mae = maeRepository.save(mae);
            return mae;
        }
            return null;
    }



    public Mae atualizarMae(Mae mae) {
        if(mae != null) {
            maeRepository.save(mae);
        }else{
//            return "Não foi possivel atualizar a mãe: "  + mae.toString();
                return null;
        }
        return  mae;
//        return "Mae atualizado com Sucesso!";
    }

    public Mae deletar(long id){
        Mae m = maeRepository.getOne(id);
        if(m !=null){
            maeRepository.deleteById(id);
        }
        return m;
    }
}
