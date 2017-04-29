package String;

public class HistoricoBase {
	
	private String serial;
	private String evento;
	private String data_gps;
	private String hora_gps;
	private String lat;
	private String lng;
	private int ignicao;
	private int velocidade;
	private String odometro;
	private int gps;
	private int entrada1;
	private int entrada2;
	private int entrada3;
	private int saida1;
	private int saida2;
	private float voltagem;
	private int bloqueio;
	private int direcao;

	
	public String getSerial() {
		return serial;
	}
	
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public String getEvento() {
		return evento;
	}
	
	public void setEvento(String evento) {
		if (TipoString.getEvt().equals(evento)) {
        	this.evento = "EVT";

		} else if(TipoString.getAlt().equals(evento)) {
			this.evento = "ALT";
			
		} else if(TipoString.getEmg().equals(evento)) {
			this.evento = "EMG";
			
		} else {
			this.evento = "STT";
		}
	}
	
	public String getData_gps() {
		return data_gps;
	}
	
	public void setData_gps(String data) {
		String ano = data.substring(0, 4);
		String mes = data.substring(4, 6);
		String dia = data.substring(6, 8);
		
		String data_gps = ano + "/" + mes + "/" + dia;
		
		this.data_gps = data_gps;
	}
	
	public String getHora_gps() {
		return hora_gps;
	}

	public void setHora_gps(String hora_gps) {
		this.hora_gps = hora_gps;
	}
	
	public String getLat() {
		return lat;
	}
	
	public void setLat(String lat) {
		this.lat = lat;
	}
	
	public String getLng() {
		return lng;
	}
	
	public void setLng(String lng) {
		this.lng = lng;
	}
	
	public int getIgnicao() {
		return ignicao;
	}
	
	public void setIgnicao(int ignicao) {
		this.ignicao = ignicao;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public String getOdometro() {
		return odometro;
	}
	
	public void setOdometro(String odometro) {
		this.odometro = odometro;
	}
	
	public int getGps() {
		return gps;
	}
	
	public void setGps(int gps) {
		this.gps = gps;
	}
	
	public int getEntrada1() {
		return entrada1;
	}
	
	public void setEntrada1(int entrada1) {
		this.entrada1 = entrada1;
	}
	
	public int getEntrada2() {
		return entrada2;
	}
	
	public void setEntrada2(int entrada2) {
		this.entrada2 = entrada2;
	}
	
	public int getEntrada3() {
		return entrada3;
	}
	
	public void setEntrada3(int entrada3) {
		this.entrada3 = entrada3;
	}
	
	public int getSaida1() {
		return saida1;
	}
	
	public void setSaida1(int saida1) {
		this.saida1 = saida1;
	}
	
	public int getSaida2() {
		return saida2;
	}
	
	public void setSaida2(int saida2) {
		this.saida2 = saida2;
	}
	
	public float getVoltagem() {
		return voltagem;
	}
	
	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}

	public int getBloqueio() {
		return bloqueio;
	}

	public void setBloqueio(int bloqueio) {
		this.bloqueio = bloqueio;
	}
	
	public int getDirecao() {
		return direcao;
	}

	public void setDirecao(int direcao) {
		this.direcao = direcao;
	}
	
	public String recuperarDataGps(){
		String dataGps = this.data_gps + " " + this.hora_gps;
		return dataGps;
	}

}
