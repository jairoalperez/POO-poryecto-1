package Programa_Zoo;

import java.sql.Statement;

import java.sql.Connection; 
import 	java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import 	java.sql.SQLException;
import javax.swing.JComboBox;

public class DB {

	//Atributos
	private static DB DB = new DB();
	public static Connection conn;
	public static Statement stmt;
	public static PreparedStatement pstmt;
	public static ResultSet rs;
	
	private String driverDB = "org.postgresql.Driver";
	private String dbUser = "postgres";
	private String dbName = "ZOO";
	private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
	private String passwordDB = "asd";
	
	private String animalDB = "tabla";
	
	private String tipoDB = "Tipo";
	private String reproduccionDB = "Reproduccion";
	private String alimentacionDB = "Alimentacion";
	private String temperamentoDB = "Temperamento";
	private String habitatDB = "habitat";
	private int cantidadDB = 0;
	
	
	
	//parte 2
		/*public Connection DB() {
			try {
				Class.forName(driverDB);
				this.conn = DriverManager.getConnection(urlDB, dbUser, passwordDB);
				System.out.println("Conexion establecida");
				
				} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
				} 
			return conn;
		}*/
	
	private DB() {
		try {
			Class.forName(driverDB);
			this.conn = DriverManager.getConnection(urlDB, dbUser, passwordDB);
			System.out.println("Conexion establecida");
			
			} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			} 
		
	}	
		
		//parte 3
		public static DB getInstances() {
			return DB;
			}
		
		//parte 4
		public ResultSet dbtipo(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("tipo")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbalimentacion(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("alimentacion")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbreproduccion(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("reproduccion")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbtemperamento(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("temperamento")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbhabitat(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("habitat")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			} 
		
		public ResultSet dbcantidad(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println(rs.getString("cantidad")); 
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			}
          
		public ResultSet dbdatosSelect(String query) {
			try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
		//	System.out.println(rs.getString("cantidad")); 
				String animales = rs.getString("tipo");
				Huevos_View.selectoviparo.addItem(animales);
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}finally {
			try {
			this.stmt.close();
			this.rs.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			}
			return rs;
			}
		
		
		
		
		
		} 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

