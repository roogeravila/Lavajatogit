/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProjetoSalao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Paulo
 */
@Entity
@Table(name = "cad_cliente", catalog = "bdsalao", schema = "")
@NamedQueries({
    @NamedQuery(name = "CadCliente.findAll", query = "SELECT c FROM CadCliente c"),
    @NamedQuery(name = "CadCliente.findByIdCliente", query = "SELECT c FROM CadCliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "CadCliente.findByNome", query = "SELECT c FROM CadCliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "CadCliente.findByCpf", query = "SELECT c FROM CadCliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "CadCliente.findByRg", query = "SELECT c FROM CadCliente c WHERE c.rg = :rg"),
    @NamedQuery(name = "CadCliente.findByEndereco", query = "SELECT c FROM CadCliente c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "CadCliente.findByTelefone1", query = "SELECT c FROM CadCliente c WHERE c.telefone1 = :telefone1"),
    @NamedQuery(name = "CadCliente.findByTelefone2", query = "SELECT c FROM CadCliente c WHERE c.telefone2 = :telefone2"),
    @NamedQuery(name = "CadCliente.findByEmail", query = "SELECT c FROM CadCliente c WHERE c.email = :email"),
    @NamedQuery(name = "CadCliente.findByDataNascimento", query = "SELECT c FROM CadCliente c WHERE c.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "CadCliente.findByCidade", query = "SELECT c FROM CadCliente c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "CadCliente.findByBairro", query = "SELECT c FROM CadCliente c WHERE c.bairro = :bairro")})
public class CadCliente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Cpf")
    private String cpf;
    @Column(name = "Rg")
    private String rg;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "Telefone1")
    private String telefone1;
    @Column(name = "Telefone2")
    private String telefone2;
    @Column(name = "Email")
    private String email;
    @Column(name = "Data_Nascimento")
    private String dataNascimento;
    @Column(name = "Cidade")
    private String cidade;
    @Column(name = "Bairro")
    private String bairro;

    public CadCliente() {
    }

    public CadCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        Integer oldIdCliente = this.idCliente;
        this.idCliente = idCliente;
        changeSupport.firePropertyChange("idCliente", oldIdCliente, idCliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        String oldTelefone1 = this.telefone1;
        this.telefone1 = telefone1;
        changeSupport.firePropertyChange("telefone1", oldTelefone1, telefone1);
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        String oldTelefone2 = this.telefone2;
        this.telefone2 = telefone2;
        changeSupport.firePropertyChange("telefone2", oldTelefone2, telefone2);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        String oldDataNascimento = this.dataNascimento;
        this.dataNascimento = dataNascimento;
        changeSupport.firePropertyChange("dataNascimento", oldDataNascimento, dataNascimento);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadCliente)) {
            return false;
        }
        CadCliente other = (CadCliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProjetoSalao.CadCliente[ idCliente=" + idCliente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
