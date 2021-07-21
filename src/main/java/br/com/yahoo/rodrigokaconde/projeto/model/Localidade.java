package br.com.yahoo.rodrigokaconde.projeto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter //metodos gettes da classe
@Setter //metodos setteres da classe
@AllArgsConstructor //contrutor com parametro
@NoArgsConstructor //construtor sem paramentro
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;

}
