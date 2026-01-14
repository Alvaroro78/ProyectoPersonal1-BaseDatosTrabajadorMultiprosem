package com.icesi.base_de_datos.model;

import java.util.HashMap;

public class Multiprosem {
    private HashMap<String,Worker> hashMap;

    public Multiprosem(){
        hashMap = new HashMap<String, Worker>();
    }

    public void casoPrueba(){
        hashMap.put("1107846732",new Worker("Alvaro" , "1107846732"));
    }

    public String getWorker(String id){
        return this.hashMap.get(id).toString();
    }
}
