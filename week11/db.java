package week11;

import java.sql.*;
import java.util.Scanner;
import java.io.Console;

public class db {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/pbo_test";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    static boolean x;

    static Scanner inp = new Scanner(System.in);
    static Console input = System.console();
    
    public static void main(String[] args) {
        int pilih;

        do{
            System.out.println("===Menu Database===");
            System.out.println("1. Show");
            System.out.println("2. Insert");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("0. Exit");
            System.out.print("Pilihan: ");
            pilih = inp.nextInt();
            switch (pilih) {
                case 1:
                    show();
                    break;
                
                case 2:
                    insert();
                    break;

                case 3:
                    update();
                    break;

                case 4:
                    delete();
                    break;

                case 0:
                    break;
            
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }while(pilih != 0);
    }

    public static void delete(){
        try {
            Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();

            show();
            System.out.print("Masukkan id: ");
            int id = inp.nextInt();

            String sql = "delete from buku where id = "+id;
			PreparedStatement ps = conn.prepareStatement(sql);

            ps.execute();
			
			stmt.close();
			conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void update(){
        String judul_buku;
		int tahun_terbit;
		int stok;
		int penulis;

        try {
            Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();

            show();
            System.out.print("Masukkan id: ");
            int id = inp.nextInt();
            System.out.print("Judul Buku: ");
            judul_buku = input.readLine();
            System.out.print("Tahun Terbit: ");
            tahun_terbit = inp.nextInt();
            System.out.print("Stok: ");
            stok = inp.nextInt();
            System.out.print("Penulis: ");
            penulis = inp.nextInt();

            String sql = "update buku set judul_buku=?, tahun_terbit=?, stok=?, penulis=? where id =?";
			PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis);
            ps.setInt(5, id);

            ps.execute();
			
			stmt.close();
			conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void isExists(String table){
        try {
            Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();

            String sql = "select 1 from "+table;
			PreparedStatement ps = conn.prepareStatement(sql);

            if(ps.execute() != false){
                x = true;
            }else {
                x = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void insert()
	{
		int id = 1;
		String judul_buku;
		int tahun_terbit;
		int stok;
		int penulis;

        System.out.println("=====Masukkan Data=====");
        System.out.print("Judul Buku: ");
        judul_buku = input.readLine();
        System.out.println("Tahun Terbit: ");
        tahun_terbit = inp.nextInt();
        System.out.println("Stok: ");
        stok = inp.nextInt();
        System.out.println("Penulis: ");
        penulis = inp.nextInt();

		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();

            isExists("buku");
            PreparedStatement ps;
            if(!x){
                String sql = "INSERT INTO buku (id,judul_buku,tahun_terbit,stok,penulis) VALUES (?,?,?,?,?)";
                ps = conn.prepareStatement(sql);
                
                ps.setInt(1, id);
                ps.setString(2, judul_buku);
                ps.setInt(3, tahun_terbit);
                ps.setInt(4, stok);
                ps.setInt(5, penulis);
            }else {
                String sql = "INSERT INTO buku (judul_buku,tahun_terbit,stok,penulis) VALUES (?,?,?,?)";
                ps = conn.prepareStatement(sql);
                
                ps.setString(1, judul_buku);
                ps.setInt(2, tahun_terbit);
                ps.setInt(3, stok);
                ps.setInt(4, penulis);
            }
			
			ps.execute();
			
			stmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void show()
	{
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM buku");
			int i = 1;
			while(rs.next())
			{
				System.out.println("Data ke-"+i);
				System.out.println("id: " + rs.getString("id"));
				System.out.println("judul_buku: "+rs.getString("judul_buku"));
				System.out.println("tahun_terbit: "+rs.getString("tahun_terbit"));
				System.out.println("stok: "+rs.getString("Stok"));
				System.out.println("penulis: "+rs.getString("penulis"));
				i++;
			}
		}
		catch(Exception e)
		{
            System.out.println("gagal terkoneksi");
			e.printStackTrace();
		}
	}
}
