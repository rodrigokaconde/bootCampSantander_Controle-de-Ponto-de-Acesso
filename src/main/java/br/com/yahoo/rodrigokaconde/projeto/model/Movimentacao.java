package br.com.yahoo.rodrigokaconde.projeto.model;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //metodos gettes da classe
@Setter //metodos setteres da classe
@AllArgsConstructor //contrutor com parametro
@NoArgsConstructor //construtor sem paramentro
@EqualsAndHashCode
@Builder
public class Movimentacao {

    @AllArgsConstructor //contrutor com parametro
    @NoArgsConstructor //construtor sem paramentro
    @EqualsAndHashCode
    @Embeddable //
    public class MovimentacaoId implements Serializable{
        private long idMovimento;
        private long idUsuario;
    }
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;
}
