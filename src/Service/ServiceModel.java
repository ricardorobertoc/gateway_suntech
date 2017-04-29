package Service;

import Dao.HistoricoEventoDao;
import Dao.HistoricoPosicaoDao;
import String.HistoricoAdicionais;
import String.HistoricoAdicionaisHd;
import String.HistoricoEvento;
import String.HistoricoPosicao;

public class ServiceModel {
	
	
	private HistoricoEvento historicoEvento;
	private HistoricoPosicao historicoPosicao;
	private HistoricoPosicaoDao historicoPosicaoDao;
	private HistoricoEventoDao historicoEventoDao;
	private HistoricoAdicionais historicoAdicionais;
	private HistoricoAdicionaisHd historicoAdicionaisHd;
	
	
	public void tratarPosicaoModel(String[] stString){
		
		historicoPosicao = new HistoricoPosicao();
		historicoPosicao = tratarPosicao(stString);
	    	
		if ( stString.length == 18 ) {
			historicoPosicaoDao = new HistoricoPosicaoDao(historicoPosicao);
			historicoPosicaoDao.inserirPosicao();
			
		} else if ( stString.length == 21 ) {
			historicoAdicionais = new HistoricoAdicionais();
			historicoAdicionais = tratarPosicaoAdicional(stString);
			
    		historicoPosicaoDao = new HistoricoPosicaoDao(historicoPosicao, historicoAdicionais);
			historicoPosicaoDao.inserirPosicaoAdicional();
			
		} else if ( stString.length == 24 ) {
			historicoAdicionaisHd = new HistoricoAdicionaisHd();
			historicoAdicionaisHd = tratarPosicaoAdicionalHd(stString);
			
    		historicoPosicaoDao = new HistoricoPosicaoDao(historicoPosicao, historicoAdicionaisHd);
			historicoPosicaoDao.inserirPosicaoAdicionalHd();
    		
		}
		
	}
	
    public void tratarEventoModel(String[] stString){
    	
    	historicoEvento = new HistoricoEvento();
		historicoEvento = tratarEvento(stString);
    	
    	if ( stString.length == 17 ) {
    		historicoEventoDao = new HistoricoEventoDao(historicoEvento);
			historicoEventoDao.inserirEvento();
			
		} else if ( stString.length == 20 ) {
    		historicoAdicionais = new HistoricoAdicionais();
			historicoAdicionais = tratarEventoAdicional(stString);
    		
			historicoEventoDao = new HistoricoEventoDao(historicoEvento, historicoAdicionais);
			historicoEventoDao.inserirEventoAdicinal();
    		
		} else if ( stString.length == 23 ) {		
    		historicoAdicionaisHd = new HistoricoAdicionaisHd();
			historicoAdicionaisHd = tratarEventoAdicionalHd(stString);
			
			historicoEventoDao = new HistoricoEventoDao(historicoEvento, historicoAdicionaisHd);
			historicoEventoDao.inserirEventoAdicinalHd();
		}
    	
	}
		

	private HistoricoPosicao tratarPosicao(String[] stString){
		
		HistoricoPosicao historicoPosicao = new HistoricoPosicao();
		
		historicoPosicao.setSerial(stString[1]);
		historicoPosicao.setEvento(stString[0]);
		historicoPosicao.setData_gps(stString[4]);
		historicoPosicao.setHora_gps(stString[5]);
		historicoPosicao.setLat(stString[7]);
		historicoPosicao.setLng(stString[8]);
		historicoPosicao.setIgnicao(Integer.parseInt(stString[15].substring(0,1)));
		historicoPosicao.setVelocidade((int) Double.parseDouble(stString[9]));
		historicoPosicao.setOdometro(stString[13]);
		/** ver questao dos satelites **/
		historicoPosicao.setGps(Integer.parseInt(stString[12])); 
		historicoPosicao.setEntrada1(Integer.parseInt(stString[15].substring(1,2)));
		historicoPosicao.setEntrada2(Integer.parseInt(stString[15].substring(2,3)));
		historicoPosicao.setEntrada3(Integer.parseInt(stString[15].substring(3,4)));
		historicoPosicao.setSaida1(Integer.parseInt(stString[15].substring(4,5)));
		historicoPosicao.setSaida2(Integer.parseInt(stString[15].substring(5,6)));
		historicoPosicao.setVoltagem(Float.parseFloat(stString[14]));
		historicoPosicao.setDirecao((int) Double.parseDouble(stString[10]));
		historicoPosicao.setCont_posicao(Integer.parseInt(stString[17]));
	
		return historicoPosicao;
	}
	
		
	private HistoricoEvento tratarEvento(String[] stString){
		
		HistoricoEvento historicoEvento = new HistoricoEvento();
		
		historicoEvento.setSerial(stString[1]);
		historicoEvento.setEvento(stString[0]);
		historicoEvento.setCod_evento(Integer.parseInt(stString[16]));
		historicoEvento.setData_gps(stString[4]);
		historicoEvento.setHora_gps(stString[5]);
		historicoEvento.setLat(stString[7]);
		historicoEvento.setLng(stString[8]);
		historicoEvento.setIgnicao(Integer.parseInt(stString[15].substring(0,1)));
		historicoEvento.setVelocidade((int) Double.parseDouble(stString[9]));
		historicoEvento.setOdometro(stString[13]);
		/** ver questao dos satelites **/
		historicoEvento.setGps(Integer.parseInt(stString[12])); 
		historicoEvento.setEntrada1(Integer.parseInt(stString[15].substring(1,2)));
		historicoEvento.setEntrada2(Integer.parseInt(stString[15].substring(2,3)));
		historicoEvento.setEntrada3(Integer.parseInt(stString[15].substring(3,4)));
		historicoEvento.setSaida1(Integer.parseInt(stString[15].substring(4,5)));
		historicoEvento.setSaida2(Integer.parseInt(stString[15].substring(5,6)));
		historicoEvento.setVoltagem(Float.parseFloat(stString[14]));
		historicoEvento.setDirecao((int) Double.parseDouble(stString[10]));
		
		return historicoEvento;
	}
	
	
	private HistoricoAdicionais tratarPosicaoAdicional(String[] stString){
		
		HistoricoAdicionais historicoAdicionais = new HistoricoAdicionais();
		
		historicoAdicionais.setHorimetro(Integer.parseInt(stString[18]));
		historicoAdicionais.setBkp_voltagem(Float.parseFloat(stString[19]));
	
		return historicoAdicionais;
	}
	
	private HistoricoAdicionaisHd tratarPosicaoAdicionalHd(String[] stString){
		
		HistoricoAdicionaisHd historicoAdicionaisHd = new HistoricoAdicionaisHd();
		
		historicoAdicionaisHd.setHorimetro(Integer.parseInt(stString[18]));
		historicoAdicionaisHd.setBkp_voltagem(Float.parseFloat(stString[19]));
		historicoAdicionaisHd.setRpm(Integer.parseInt(stString[21]));

	
		return historicoAdicionaisHd;
	}
	
	private HistoricoAdicionais tratarEventoAdicional(String[] stString){
		
		HistoricoAdicionais historicoAdicionais = new HistoricoAdicionais();
		
		historicoAdicionais.setHorimetro(Integer.parseInt(stString[17]));
		historicoAdicionais.setBkp_voltagem(Float.parseFloat(stString[18]));
	
		return historicoAdicionais;
	}
	
	private HistoricoAdicionaisHd tratarEventoAdicionalHd(String[] stString){
		
		HistoricoAdicionaisHd historicoAdicionaisHd = new HistoricoAdicionaisHd();
		
		historicoAdicionaisHd.setHorimetro(Integer.parseInt(stString[17]));
		historicoAdicionaisHd.setBkp_voltagem(Float.parseFloat(stString[18]));
		historicoAdicionaisHd.setRpm(Integer.parseInt(stString[20]));

	
		return historicoAdicionaisHd;
	}

}
