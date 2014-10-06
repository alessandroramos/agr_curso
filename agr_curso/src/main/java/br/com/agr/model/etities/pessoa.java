package br.com.agr.model.etities;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name="pessoa")
public class pessoa 
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name="IdPessoa", nullable=false)
    private Integer idPessoa;
    @Column(name="nome", nullable = false, length = 50)
    private String nome;
    @Column(name="telefone", nullable = false, length = 15)//(37)3321-7035
    private String telefone;
    @Column(name="email", nullable = false, length = 60)
    private String email;
    @Column(name="cpf", nullable = false, length = 14)//004.556.376-44
    private String cpf;
    @Column(name="dataDeNascimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeNascimento;
    @Column(name="dataDeCadastro", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDeCadastro;

    public pessoa() 
    {
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.idPessoa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final pessoa other = (pessoa) obj;
        if (!Objects.equals(this.idPessoa, other.idPessoa)) {
            return false;
        }
        return true;
    }    
}
