package com.example.CURSO.service;

import com.example.CURSO.model.enumeric.RespostaModel;
import com.example.CURSO.model.enumeric.enun.Categorias;
import com.example.CURSO.model.enumeric.enun.StatusTopico;
import com.example.CURSO.repository.IRespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {

    @Autowired
    private IRespostaRepository iRespostaRepository;

    public List<RespostaModel> buscarTodasRespostas() {
        return iRespostaRepository.findAll();
    }

    public Optional<RespostaModel> buscarRespostaPorId(Long codigo) {
        return iRespostaRepository.findById(codigo);
    }

    public RespostaModel cadastrarResposta(RespostaModel respostaModel) {

        if (respostaModel.getDataCriacao() == null) {
            LocalDate dataCriacao = LocalDate.now();
            respostaModel.setDataCriacao(dataCriacao);
        }
        return iRespostaRepository.save(respostaModel);
    }

    public RespostaModel atualizarResposta(RespostaModel respostaModel, Long codigo) {
        Optional<RespostaModel> optionalRespostaModel = iRespostaRepository.findById(codigo);

        RespostaModel respostaAtualizada = optionalRespostaModel.get();
        StatusTopico statusAtualizado = StatusTopico.valueOf(respostaModel.getStatus());
        respostaAtualizada.setStatus(String.valueOf(statusAtualizado));
        respostaAtualizada.setSolucao(respostaAtualizada.isSolucao());

        return iRespostaRepository.save(respostaAtualizada);
    }

    public void deletarResposta(Long codigo){
        iRespostaRepository.deleteById(codigo);
    }

    public List<RespostaModel> findByStatusTopico (StatusTopico statusTopico){
        return iRespostaRepository.findByStatusTopico(statusTopico);
    }

    public List<RespostaModel> findByCategorias (Categorias categorias){
        return iRespostaRepository.findByCategorias(categorias);
    }

    }
