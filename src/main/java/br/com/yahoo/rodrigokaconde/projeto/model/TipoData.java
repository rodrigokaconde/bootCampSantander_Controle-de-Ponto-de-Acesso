package br.com.yahoo.rodrigokaconde.projeto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter //metodos gettes da classe
@Setter //metodos setteres da classe
@AllArgsConstructor //contrutor com parametro
@NoArgsConstructor //construtor sem paramentro
@EqualsAndHashCode
@Builder
@Entity
public class TipoData {
    @Id
    private Long id;
    private String descricao;
}
