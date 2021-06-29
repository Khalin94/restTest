package com.example.restsample.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class SampleRequest {
    int id;
    String name;
    int age;

    @Override
    public String toString(){
        return "id : " + this.id + " name : " + this.name + " age : " + this.age;
    }

}
