package String;


public class HistoricoEvento extends HistoricoBase{
	

	private int cod_evento;
	
	
	public int getCod_evento() {
		return cod_evento;
	}
	
	public void setCod_evento(int cod_evento) {
		this.cod_evento = cod_evento;
	}
	
	
	public int recuperarPanico(){
		if ( TipoString.getEmg().equals(this.getEvento()) &&
	  			this.cod_evento == 1 ) 
		{
			return 1;
			
		} else 
		{
			return 0;
		}
	}
	

}
