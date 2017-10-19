package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import model.Peca;
import model.Tipo;
import model.dao.GenericDAO;

@SuppressWarnings("deprecation")
@ManagedBean(name = "cadastrarPecasBean")
public class CadastrarPecaBean {


	private Peca peca = new Peca();
	
	private List<Tipo> tipo = new ArrayList<Tipo>();

	@PostConstruct
	public void init() {
		tipo = Arrays.asList(Tipo.values());
	}

	public String salvar() {
		new GenericDAO<Peca>(Peca.class).salvar(peca);
		peca = new Peca();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Peça cadastrada com sucesso!"));

		return "cadastrarPeca.xhtml";
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public List<Tipo> getTipo() {
		return tipo;
	}

	public void setTipo(List<Tipo> tipo) {
		this.tipo = tipo;
	}
	
	

}
