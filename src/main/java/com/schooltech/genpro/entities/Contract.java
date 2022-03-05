package com.schooltech.genpro.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;


@Entity
@Table(name="CONTRACT")
@Data @NoArgsConstructor @AllArgsConstructor
@Setter
@Getter
@ToString 
public class Contract implements Serializable {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long contractId;

    @Column(name="type_contrat")
    private String type;

    @Column(name="marge_contrat")
    private double marge;

    @OneToMany(mappedBy="contract", fetch=FetchType.EAGER)
    private Collection<Client> clients;


    
}
