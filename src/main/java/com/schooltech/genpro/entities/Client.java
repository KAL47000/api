package com.schooltech.genpro.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;


@Entity
@Table(name="CLIENT")
@Data @NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
@ToString
public class Client implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClient;

    @Column(name="name")
    private String name;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @ManyToOne
    @JoinColumn(name="contrat_id")
    private Contract contract;


    @OneToMany(mappedBy="client", fetch=FetchType.EAGER)
    private Collection<Product> products;

    @JsonIgnore
    public Contract getContract(){

        return this.contract;
    }

    @JsonSetter
    public void setContract(Contract contract){
        this.contract=contract;
    }
    
}
