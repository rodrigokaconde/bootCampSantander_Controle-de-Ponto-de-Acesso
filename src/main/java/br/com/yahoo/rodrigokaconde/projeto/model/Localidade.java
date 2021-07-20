package br.com.yahoo.rodrigokaconde.projeto.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter //metodos gettes da classe
@Setter //metodos setteres da classe
@AllArgsConstructor //contrutor com parametro
@NoArgsConstructor //construtor sem paramentro
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;

}
