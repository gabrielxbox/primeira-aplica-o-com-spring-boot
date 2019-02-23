package com.exemple.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;

import org.hibernate.annotations.Columns;
import org.hibernate.validator.constraints.NotEmpty;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class Lenbrete implements Serializable{
	
	private static long Serializable = 1L;
@Id
@GeneratedValue (strategy=GenerationType.AUTO)


private long codigo;

private String titulo;

private String mensagem;

private Data data;

public long getCodigo() {
	return codigo;
}

public void setCodigo(long codigo) {
	this.codigo = codigo;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getMensagem() {
	return mensagem;
}

public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
}

public Data getData() {
	return data;
}

public void setData(Data data) {
	this.data = data;
}




}
