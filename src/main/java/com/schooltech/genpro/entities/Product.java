package com.schooltech.genpro.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;


@Entity
@Table(name="PRODUCT")
@Data @NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="cost_production")
    private double costProduction;


    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;


    @JsonIgnore
    public Client getClient(){

        return this.client;
    }

    @JsonSetter
    public void setClient(Client client){
        this.client=client;
    }



    
}
