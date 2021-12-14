package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Produto;

public class Exemplo {
	
	public static void main(String[]args) throws Exception {
		
		Configuration cfg = new Configuration().configure(); // carrega a configura��o do hibernate - o arquivo hibernate.cfg.xml ser� lido
		SessionFactory sf= cfg.buildSessionFactory(); // Cria uma uma conex�o com o banco dados
		
		Session session = sf.getCurrentSession(); // representa a conex�o com o banco de dados
		
		Produto p = new Produto();
		p.setNome("P1");
		
		session.beginTransaction();// S� � possivel manipular tabelas, se estiver dentro de uma transacao
		session.save(p); 
		session.getTransaction().commit();
		
		System.out.println(p.getId());
	}
}
