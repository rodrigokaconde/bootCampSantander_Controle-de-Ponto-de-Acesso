package br.com.yahoo.rodrigokaconde.projeto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BancoHoras {

    @AllArgsConstructor //contrutor com parametro
    @NoArgsConstructor //construtor sem paramentro
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable{
        private Long idBancoHoras;
        private Long idMovimentacao;
        private Long idUsuario;
    }
    @Id
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
