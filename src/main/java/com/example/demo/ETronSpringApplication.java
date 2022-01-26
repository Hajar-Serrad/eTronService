package com.example.demo;

import org.springframework.boot.SpringApplication;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo.controller"})
public class ETronSpringApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(ETronSpringApplication.class, args);
	}*/
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Votre fonction Run
                // Vos information de connexion à une base de données
                String BDD = "eTronDB";
                String url = "jdbc:mysql://localhost:3306/" + BDD;
                String user = "root";
                String passwd = "Wa3raton#";
                // L'essaie de connexion à votre base de donées
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, user, passwd);
                    System.out.println("Connecter");
                    SpringApplication.run(ETronSpringApplication.class, args);
                } catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Erreur");
                    System.exit(0);
                }
            }
        });
    
	}
}
