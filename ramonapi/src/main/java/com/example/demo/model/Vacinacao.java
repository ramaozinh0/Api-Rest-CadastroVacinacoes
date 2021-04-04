package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Vacinacao implements Serializable{
		
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private Long id;
		
		
		private String email;
		
		private Long datavacinacao;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getDatavacinacao() {
			return datavacinacao;
		}

		public void setDatavacinacao(Long datavacinacao) {
			this.datavacinacao = datavacinacao;
		}
		
	


		
}
