package learn.dto.controller;

import learn.dto.DTO.AppDTORequest;
import learn.dto.DTO.AppDTOResponse;

import learn.dto.service.AppService;

import learn.dto.model.AppModel;

public class AppController {

    private AppService service = new AppService();

    public String register(String name, String text) {

        try{

            AppDTOResponse response = service.register(new AppDTORequest(name,text));

            return "A conta de nome: "+response.name()+" foi criada com sucesso!";

        }catch(RuntimeException e) {

            return "Ocorreu um erro: "+e.getMessage();

        }

    }

    public void update(String name, String text) {

        try{



        }catch(RuntimeException e) {

            System.out.println("Ocorreu um erro: "+e.getMessage());

        }

    }

}
