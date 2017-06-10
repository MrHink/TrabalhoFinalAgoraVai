package Dados;

import java.util.Date;

public class Leilao {

	private boolean leilao;
	private boolean tipoLeilao;
	private Date inicio;
	private Date termino;
	
	
	public Leilao(boolean l, boolean tl, Date i, Date t){
		this.leilao = l;
		this.tipoLeilao = tl;		
		this.inicio = i;
		this.termino = t;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getTermino() {
		return termino;
	}
	public void setTermino(Date termino) {
		this.termino = termino;
	}
	public String getLeilao() {
		if(leilao == true){
			return "Demanda";
		}else{
			return "Oferta";
		}
	}
	public void setLeilao(boolean leilao) {
		this.leilao = leilao;
	}
	public String getTipoLeilao() {
		if(tipoLeilao == true){
			return "Aberto";
		}else{
			return "Fechado";
		}
	}
	public void setTipoLeilao(boolean tipoLeilao) {
		this.tipoLeilao = tipoLeilao;
	}
	
}
