package tester;

import javax.inject.Inject;

import model.DadosException;
import model.Peca;
import model.Tipo;
import model.dao.GenericDAO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Peca p = new Peca();
		try {
			p.setCod(34);
			p.setId(1);
			p.setPrecoDeCompra(50.63);
			p.setPrecoVendaSugerido(100.20);
			p.setQtd(25);
			p.setTipo(Tipo.ANEL);
			
			new GenericDAO<Peca>(Peca.class).salvar(p);
			
		} catch (DadosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p.getCod());
		System.out.println(p.getTipo().name());
		System.out.println(p.getPrecoDeCompra());
		
	}

}
