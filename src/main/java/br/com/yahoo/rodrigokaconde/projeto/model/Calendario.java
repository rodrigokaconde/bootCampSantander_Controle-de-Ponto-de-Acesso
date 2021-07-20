package br.com.yahoo.rodrigokaconde.projeto.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter //metodos gettes da classe
@Setter //metodos setteres da classe
@AllArgsConstructor //contrutor com parametro
@NoArgsConstructor //construtor sem paramentro
@EqualsAndHashCode
@Builder
public class Calendario {
    private long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
