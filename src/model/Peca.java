package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pecas")
public class Peca implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "CLIENTE_ID", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "CLIENTE_ID", sequenceName = "SEQ_CLIENTE", allocationSize = 1)
	private Integer id;

	private int cod_peca;
	private Double precoDeCompra;
	private Double precoVendaSugerido;
	private Double precoVendaPraticado;
	private int qtd;
	private Tipo tipo;

	public Peca() {

	}

	public Peca(int cod, Double PrecoDeCompra, double precoVendaSugerido, int qtd, Tipo tipo) throws DadosException {
		this.setCod(cod);
		this.setPrecoDeCompra(PrecoDeCompra);
		this.setPrecoVendaSugerido(precoVendaSugerido);
		this.setQtd(qtd);
		this.setTipo(tipo);
	}

	public int getCod() {
		return cod_peca;
	}

	public void setCod(int cod) throws DadosException {
		Peca.validarCod(cod);
		this.cod_peca = cod;
	}

	public Double getPrecoDeCompra() {
		return precoDeCompra;
	}

	public void setPrecoDeCompra(Double precoDeCompra) throws DadosException {
		Peca.validarPrecoCompra(precoDeCompra);
		this.precoDeCompra = precoDeCompra;
	}

	public Double getPrecoVendaSugerido() {
		return precoVendaSugerido;
	}

	public void setPrecoVendaSugerido(Double precoVendaSugerido) throws DadosException {
		Peca.validarPrecoVendaSugerido(precoVendaSugerido);
		this.precoVendaSugerido = precoVendaSugerido;
	}

	public Double getPrecoVendaPraticado() {
		return precoVendaPraticado;
	}

	public void setPrecoVendaPraticado(Double precoVendaPraticado) throws DadosException {
		Peca.validarPrecoVendaPraticado(precoVendaPraticado);
		this.precoVendaPraticado = precoVendaPraticado;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) throws DadosException {
		Peca.ValidarQTD(qtd);
		this.qtd = qtd;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) throws DadosException {
		Peca.validarTipo(tipo);
		this.tipo = tipo;
	}

	// MÉTODOS VALIDADORES

	private static void validarCod(int cod) throws DadosException {
		// TODO Auto-generated method stub

	}

	private static void validarPrecoCompra(Double precoDeCompra) throws DadosException {
		// TODO Auto-generated method stub

	}

	private static void validarPrecoVendaSugerido(Double precoVendaSugerido) throws DadosException {
		// TODO Auto-generated method stub

	}

	private static void validarPrecoVendaPraticado(Double precoVendaPraticado) throws DadosException {
		// TODO Auto-generated method stub

	}

	private static void ValidarQTD(int qtd) throws DadosException {
		// TODO Auto-generated method stub

	}

	private static void validarTipo(Tipo tipo) throws DadosException {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod_peca;
		result = prime * result + ((precoDeCompra == null) ? 0 : precoDeCompra.hashCode());
		result = prime * result + ((precoVendaPraticado == null) ? 0 : precoVendaPraticado.hashCode());
		result = prime * result + ((precoVendaSugerido == null) ? 0 : precoVendaSugerido.hashCode());
		result = prime * result + qtd;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peca other = (Peca) obj;
		if (cod_peca != other.cod_peca)
			return false;
		if (precoDeCompra == null) {
			if (other.precoDeCompra != null)
				return false;
		} else if (!precoDeCompra.equals(other.precoDeCompra))
			return false;
		if (precoVendaPraticado == null) {
			if (other.precoVendaPraticado != null)
				return false;
		} else if (!precoVendaPraticado.equals(other.precoVendaPraticado))
			return false;
		if (precoVendaSugerido == null) {
			if (other.precoVendaSugerido != null)
				return false;
		} else if (!precoVendaSugerido.equals(other.precoVendaSugerido))
			return false;
		if (qtd != other.qtd)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

}
