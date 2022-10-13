/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.goemergency.model;

import java.util.Date;

/**
 *
 * @author Tassia
 */
public class Medico extends Pessoa{
    private Integer idMedico;
    private String crm;
    private String ufcrm;
    private String especialidade;
    private Pessoa pessoa;
    private Date inactivatedAt;
    private Date createdAt;
    private Date updatedat;

    public Medico() {
    }

    public Medico(Integer idMedico, String crm, String ufcrm, String especialidade, Pessoa pessoa, Date inactivatedAt, Date createdAt, Date updatedat) {
        this.idMedico = idMedico;
        this.crm = crm;
        this.ufcrm = ufcrm;
        this.especialidade = especialidade;
        this.pessoa = pessoa;
        this.inactivatedAt = inactivatedAt;
        this.createdAt = createdAt;
        this.updatedat = updatedat;
    }

    public Medico(Integer idPessoa, String cpf, String nome, Date datanascimento, String email, String senha, Integer idEndereco, String Telefone, 
            Boolean isMedico, Boolean isAdmin, Date inactivatedAt, Date createdAt, Date updatedat) {
        super(idPessoa, cpf, nome, datanascimento, email, senha, idEndereco, Telefone, isMedico, isAdmin, inactivatedAt, createdAt, updatedat);
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getUfcrm() {
        return ufcrm;
    }

    public void setUfcrm(String ufcrm) {
        this.ufcrm = ufcrm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public Date getInactivatedAt() {
        return inactivatedAt;
    }

    @Override
    public void setInactivatedAt(Date inactivatedAt) {
        this.inactivatedAt = inactivatedAt;
    }

    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public Date getUpdatedat() {
        return updatedat;
    }

    @Override
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public Boolean getIsPaciente() {
        return isPaciente;
    }

    public void setIsPaciente(Boolean isPaciente) {
        this.isPaciente = isPaciente;
    }

    public Boolean getIsMedico() {
        return isMedico;
    }

    public void setIsMedico(Boolean isMedico) {
        this.isMedico = isMedico;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
