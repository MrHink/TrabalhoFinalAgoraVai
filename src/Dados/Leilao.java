package Dados;

public class Leilao {

	private boolean leilao;
	private boolean tipoLeilao;
	public Leilao(boolean l, boolean tl){
		this.leilao = l;
		this.tipoLeilao = tl;		
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
