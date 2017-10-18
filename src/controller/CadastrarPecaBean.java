package controller;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import model.Peca;
import model.dao.GenericDAO;

@SuppressWarnings("deprecation")
@ManagedBean(name = "cadastrarPecasBean")
@SessionScoped
public class CadastrarPecaBean {
	
	@Inject
	Peca peca;
	
	public String salvar() {
		new GenericDAO<Peca>(Peca.class).salvar(peca);
		peca = new Peca();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Peça cadastrada com sucesso!"));
		
		return "cadastrarPeca.xhtml";
}
	
}
