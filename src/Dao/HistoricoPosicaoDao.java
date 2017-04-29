package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

import Connection.ConnectionFactory;
import String.HistoricoAdicionais;
import String.HistoricoAdicionaisHd;
import String.HistoricoPosicao;

public class HistoricoPosicaoDao {
	
	private HistoricoPosicao historicoPosicao;
	private HistoricoAdicionais historicoAdicionais;
	private HistoricoAdicionaisHd historicoAdicionaisHd;
	
	public HistoricoPosicaoDao(HistoricoPosicao hist ) {
		this.historicoPosicao = hist;
		 
	}
	
	public HistoricoPosicaoDao(HistoricoPosicao hist, HistoricoAdicionais hisAdd ) {
		this.historicoPosicao = hist;
		this.historicoAdicionais = hisAdd;
	}
	
	public HistoricoPosicaoDao(HistoricoPosicao hist, HistoricoAdicionaisHd hisAddHd ) {
		this.historicoPosicao = hist;
		this.historicoAdicionaisHd = hisAddHd;
	}
	
	public void inserirPosicao()  {

		 try {
			 
			Connection con = new ConnectionFactory().getConnection();
		
		    String sql = "insert into historicos" +
		            " (serial, lat, lng, ignicao, velocidade, odometro, gps, entrada1," +
		            " entrada2, entrada3, saida1, saida2, data_gps, bloqueio, voltagem, direcao," +
		            " cont_posicao, evento)" +
		            " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		    
		    PreparedStatement stmt = con.prepareStatement(sql);
		
		    stmt.setString(1, historicoPosicao.getSerial());
		    stmt.setString(2, historicoPosicao.getLat());
		    stmt.setString(3, historicoPosicao.getLng());
		    stmt.setInt(4, historicoPosicao.getIgnicao());
		    stmt.setInt(5, historicoPosicao.getVelocidade());
		    stmt.setString(6, historicoPosicao.getOdometro());
		    stmt.setInt(7, historicoPosicao.getGps());
		    stmt.setInt(8, historicoPosicao.getEntrada1());
		    stmt.setInt(9, historicoPosicao.getEntrada2());
		    stmt.setInt(10, historicoPosicao.getEntrada3());
		    stmt.setInt(11, historicoPosicao.getSaida1());
		    stmt.setInt(12, historicoPosicao.getSaida2());
		    stmt.setString(13, historicoPosicao.recuperarDataGps());
		    stmt.setInt(14, historicoPosicao.getSaida1());
		    stmt.setFloat(15, historicoPosicao.getVoltagem());
		    stmt.setInt(16, historicoPosicao.getDirecao());
		    stmt.setInt(17, historicoPosicao.getCont_posicao());
		    stmt.setString(18, historicoPosicao.getEvento());
		
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
	
	public void inserirPosicaoAdicional()  {

		 try {
			 
			Connection con = new ConnectionFactory().getConnection();
		
		    String sql = "insert into historicos" +
		            " (serial, lat, lng, ignicao, velocidade, odometro, gps, entrada1," +
		            " entrada2, entrada3, saida1, saida2, data_gps, bloqueio, voltagem, direcao," +
		            " cont_posicao, evento, horimetro, bkp_voltagem)" +
		            " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		    
		    PreparedStatement stmt = con.prepareStatement(sql);
		
		    stmt.setString(1, historicoPosicao.getSerial());
		    stmt.setString(2, historicoPosicao.getLat());
		    stmt.setString(3, historicoPosicao.getLng());
		    stmt.setInt(4, historicoPosicao.getIgnicao());
		    stmt.setInt(5, historicoPosicao.getVelocidade());
		    stmt.setString(6, historicoPosicao.getOdometro());
		    stmt.setInt(7, historicoPosicao.getGps());
		    stmt.setInt(8, historicoPosicao.getEntrada1());
		    stmt.setInt(9, historicoPosicao.getEntrada2());
		    stmt.setInt(10, historicoPosicao.getEntrada3());
		    stmt.setInt(11, historicoPosicao.getSaida1());
		    stmt.setInt(12, historicoPosicao.getSaida2());
		    stmt.setString(13, historicoPosicao.recuperarDataGps());
		    stmt.setInt(14, historicoPosicao.getSaida1());
		    stmt.setFloat(15, historicoPosicao.getVoltagem());
		    stmt.setInt(16, historicoPosicao.getDirecao());
		    stmt.setInt(17, historicoPosicao.getCont_posicao());
		    stmt.setString(18, historicoPosicao.getEvento());
		    stmt.setInt(19, historicoAdicionais.getHorimetro());
		    stmt.setFloat(20, historicoAdicionais.getBkp_voltagem());
		
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
	
	 public void inserirPosicaoAdicionalHd()  {

		 try {
			 
			Connection con = new ConnectionFactory().getConnection();
		
		    String sql = "insert into historicos" +
		            " (serial, lat, lng, ignicao, velocidade, odometro, gps, entrada1," +
		            " entrada2, entrada3, saida1, saida2, data_gps, bloqueio, voltagem, direcao," +
		            " cont_posicao, evento, horimetro, bkp_voltagem, rpm)" +
		            " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		    
		    PreparedStatement stmt = con.prepareStatement(sql);
		
		    stmt.setString(1, historicoPosicao.getSerial());
		    stmt.setString(2, historicoPosicao.getLat());
		    stmt.setString(3, historicoPosicao.getLng());
		    stmt.setInt(4, historicoPosicao.getIgnicao());
		    stmt.setInt(5, historicoPosicao.getVelocidade());
		    stmt.setString(6, historicoPosicao.getOdometro());
		    stmt.setInt(7, historicoPosicao.getGps());
		    stmt.setInt(8, historicoPosicao.getEntrada1());
		    stmt.setInt(9, historicoPosicao.getEntrada2());
		    stmt.setInt(10, historicoPosicao.getEntrada3());
		    stmt.setInt(11, historicoPosicao.getSaida1());
		    stmt.setInt(12, historicoPosicao.getSaida2());
		    stmt.setString(13, historicoPosicao.recuperarDataGps());
		    stmt.setInt(14, historicoPosicao.getSaida1());
		    stmt.setFloat(15, historicoPosicao.getVoltagem());
		    stmt.setInt(16, historicoPosicao.getDirecao());
		    stmt.setInt(17, historicoPosicao.getCont_posicao());
		    stmt.setString(18, historicoPosicao.getEvento());
		    stmt.setInt(19, historicoAdicionaisHd.getHorimetro());
		    stmt.setFloat(20, historicoAdicionaisHd.getBkp_voltagem());
		    stmt.setInt(21, historicoAdicionaisHd.getRpm());
		
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
