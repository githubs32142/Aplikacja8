package pl.techstyle.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Pracownicy")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2778610949231152156L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pracownika")
	Long id;
	
	@Column(name="Imie")
	String name=null;
	@Column(name="Nazwisko")
	String surName;
	@Column(name="Adres")
	String adress;
	@Column(name="Wiek")
	Long age;
	@Column(name="Pesel")
	String pesel;
	@Column(name="Telefon")
	String phoneNumber;
	
	
	

}
