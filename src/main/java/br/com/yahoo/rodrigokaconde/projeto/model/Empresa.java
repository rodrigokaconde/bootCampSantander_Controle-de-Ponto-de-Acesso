package br.com.yahoo.rodrigokaconde.projeto.model;

import com.sun.source.doctree.SeeTree;
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
public class Empresa {
    @Id
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}
