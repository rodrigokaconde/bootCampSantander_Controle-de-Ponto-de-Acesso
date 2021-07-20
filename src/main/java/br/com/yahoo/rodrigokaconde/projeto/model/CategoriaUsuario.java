package br.com.yahoo.rodrigokaconde.projeto.model;

import lombok.*;

@Getter //metodos gettes da classe
@Setter //metodos setteres da classe
@AllArgsConstructor //contrutor com parametro
@NoArgsConstructor //construtor sem paramentro
@EqualsAndHashCode
@Builder
public class CategoriaUsuario {
    private long id;
    private String descricao;
}
