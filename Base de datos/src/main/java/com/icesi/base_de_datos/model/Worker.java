package com.icesi.base_de_datos.model;

public class Worker {
    private String name;
    private String id;

    public Worker(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return name;
    }
}
