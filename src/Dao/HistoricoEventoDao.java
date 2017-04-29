package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

import Connection.ConnectionFactory;
import String.HistoricoAdicionais;
import String.HistoricoAdicionaisHd;
import String.HistoricoEvento;

public class HistoricoEventoDao {
	
	private HistoricoEvento historicoEvento;
	private HistoricoAdicionais historicoAdicionais;
	private HistoricoAdicionaisHd historicoAdicionaisHd;
	
	
	public HistoricoEventoDao(HistoricoEvento hist ) {
		this.historicoEvento = hist;
	}
	
	public HistoricoEventoDao(HistoricoEvento hist, HistoricoAdicionais hisAdd ) {
		this.historicoEvento = hist;
		this.historicoAdicionais = hisAdd;
	}
	
	public HistoricoEventoDao(HistoricoEvento hist, HistoricoAdicionaisHd hisAddHd ) {
		this.historicoEvento = hist;
		this.historicoAdicionaisHd = hisAddHd;
	}
	
	public void inserirEvento() {

	 
	     try {
	    	 
	    	 Connection con = new ConnectionFactory().getConnection();

             String sql = "insert into historicos" +
                     " (serial, evento, cod_evento, lat, lng, ignicao, velocidade, odometro," +
                     " gps, entrada1, entrada2, entrada3, saida1, saida2, data_gps, bloqueio, panico," +
                     " voltagem, direcao)" +
                     " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
             
             PreparedStatement stmt = con.prepareStatement(sql);

             stmt.setString(1, historicoEvento.getSerial());
             stmt.setString(2, historicoEvento.getEvento());
             stmt.setInt(3, historicoEvento.getCod_evento());
             stmt.setString(4, historicoEvento.getLat());
             stmt.setString(5, historicoEvento.getLng());
             stmt.setInt(6, historicoEvento.getIgnicao());
             stmt.setInt(7, historicoEvento.getVelocidade());
             stmt.setString(8, historicoEvento.getOdometro());
          	 stmt.setInt(9, historicoEvento.getGps());
          	 stmt.setInt(10, historicoEvento.getEntrada1());
          	 stmt.setInt(11, historicoEvento.getEntrada2());
          	 stmt.setInt(12, historicoEvento.getEntrada3());
          	 stmt.setInt(13, historicoEvento.getSaida1());
          	 stmt.setInt(14, historicoEvento.getSaida2());
          	 stmt.setString(15, historicoEvento.recuperarDataGps());
          	 stmt.setInt(16, historicoEvento.getSaida1());
          	 stmt.setInt(17, historicoEvento.recuperarPanico());
          	 stmt.setFloat(18, historicoEvento.getVoltagem());
          	 stmt.setInt(19, historicoEvento.getDirecao());
          	
             stmt.execute();
             stmt.close();
             
             LocalDateTime dataHoraAtual = LocalDateTime.now();
            
             System.out.println("Gravado em " + dataHoraAtual);
             con.close();
	         
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	
	 public void inserirEventoAdicinal() {
		 
	     try {
	    	 
	    	 Connection con = new ConnectionFactory().getConnection();

            String sql = "insert into historicos" +
                    " (serial, evento, cod_evento, lat, lng, ignicao, velocidade, odometro," +
                    " gps, entrada1, entrada2, entrada3, saida1, saida2, data_gps, bloqueio, panico," +
                    " voltagem, direcao, horimetro, bkp_voltagem)" +
                    " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, historicoEvento.getSerial());
            stmt.setString(2, historicoEvento.getEvento());
            stmt.setInt(3, historicoEvento.getCod_evento());
            stmt.setString(4, historicoEvento.getLat());
            stmt.setString(5, historicoEvento.getLng());
            stmt.setInt(6, historicoEvento.getIgnicao());
            stmt.setInt(7, historicoEvento.getVelocidade());
            stmt.setString(8, historicoEvento.getOdometro());
	     	stmt.setInt(9, historicoEvento.getGps());
	     	stmt.setInt(10, historicoEvento.getEntrada1());
	     	stmt.setInt(11, historicoEvento.getEntrada2());
	     	stmt.setInt(12, historicoEvento.getEntrada3());
	     	stmt.setInt(13, historicoEvento.getSaida1());
	     	stmt.setInt(14, historicoEvento.getSaida2());
	     	stmt.setString(15, historicoEvento.recuperarDataGps());
	     	stmt.setInt(16, historicoEvento.getSaida1());
	     	stmt.setInt(17, historicoEvento.recuperarPanico());
	     	stmt.setFloat(18, historicoEvento.getVoltagem());
	     	stmt.setInt(19, historicoEvento.getDirecao());
         	stmt.setInt(20, historicoAdicionais.getHorimetro());
		    stmt.setFloat(21, historicoAdicionais.getBkp_voltagem());
         	
            stmt.execute();
            stmt.close();
            
            LocalDateTime dataHoraAtual = LocalDateTime.now();
           
            System.out.println("Gravado em " + dataHoraAtual);
            con.close();
	         
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public void inserirEventoAdicinalHd() {
		 
	     try {
	    	 
	    	 Connection con = new ConnectionFactory().getConnection();

            String sql = "insert into historicos" +
                    " (serial, evento, cod_evento, lat, lng, ignicao, velocidade, odometro," +
                    " gps, entrada1, entrada2, entrada3, saida1, saida2, data_gps, bloqueio, panico," +
                    " voltagem, direcao, horimetro, bkp_voltagem, rpm)" +
                    " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, historicoEvento.getSerial());
            stmt.setString(2, historicoEvento.getEvento());
            stmt.setInt(3, historicoEvento.getCod_evento());
            stmt.setString(4, historicoEvento.getLat());
            stmt.setString(5, historicoEvento.getLng());
            stmt.setInt(6, historicoEvento.getIgnicao());
            stmt.setInt(7, historicoEvento.getVelocidade());
            stmt.setString(8, historicoEvento.getOdometro());
	     	stmt.setInt(9, historicoEvento.getGps());
	     	stmt.setInt(10, historicoEvento.getEntrada1());
	     	stmt.setInt(11, historicoEvento.getEntrada2());
	     	stmt.setInt(12, historicoEvento.getEntrada3());
	     	stmt.setInt(13, historicoEvento.getSaida1());
	     	stmt.setInt(14, historicoEvento.getSaida2());
	     	stmt.setString(15, historicoEvento.recuperarDataGps());
	     	stmt.setInt(16, historicoEvento.getSaida1());
	     	stmt.setInt(17, historicoEvento.recuperarPanico());
	     	stmt.setFloat(18, historicoEvento.getVoltagem());
	     	stmt.setInt(19, historicoEvento.getDirecao());
         	stmt.setInt(20, historicoAdicionaisHd.getHorimetro());
		    stmt.setFloat(21, historicoAdicionaisHd.getBkp_voltagem());
		    stmt.setInt(22, historicoAdicionaisHd.getRpm());
         	
            stmt.execute();
            stmt.close();
            
            LocalDateTime dataHoraAtual = LocalDateTime.now();
           
            System.out.println("Gravado em " + dataHoraAtual);
            con.close();
	         
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
