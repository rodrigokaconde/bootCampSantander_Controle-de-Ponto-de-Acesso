package br.com.yahoo.rodrigokaconde.projeto.model;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //metodos gettes da classe
@Setter //metodos setteres da classe
@AllArgsConstructor //contrutor com parametro
@NoArgsConstructor //construtor sem paramentro
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

    @AllArgsConstructor //contrutor com parametro
    @NoArgsConstructor //construtor sem paramentro
    @EqualsAndHashCode
    @Embeddable //
    public class MovimentacaoId implements Serializable{
        private Long idMovimento;
        private Long idUsuario;
    }
    @Id
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
