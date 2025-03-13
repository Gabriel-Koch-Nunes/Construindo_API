package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CarService {
    private String consultarURL(String apiUrl){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl,String.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
        }else{
            dados = "Falha" + responseEntity.getStatusCode();
        }
        return dados;
    }
    public String consultarMarcas(){
        return consultarURL(null);
    }
    public String consultarModelos(int id){
        return consultarURL(null);
    }
    public String consultarAnos(int marca, int modelo){
        return consultarURL(null);
    }
    public String consultarValor(int marca, int modelo, String ano){
        return consultarURL(null);
    }
}
    

