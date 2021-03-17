package com.pablodeyvid.demo.dto;

import java.io.Serializable;
import java.time.Instant;

import com.pablodeyvid.demo.entities.Resposta;

public class RespostaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String email;
	private Instant data_hora;
	private String campus;
	private String modalidade;
	private String periodo;
	private String f;
	private String g;
	private String h;
	private String i;
	private String j;
	private String k;
	private String l;
	private String m;
	private String n;
	private String o;
	private String p;
	private String q;
	private String r;
	private String s;
	private String t;
	
	public RespostaDTO() {}
	
	public RespostaDTO(Long id, String email, Instant data_hora, String campus, String modalidade, String periodo,
			String f, String g, String h, String i, String j, String k, String l, String m, String n, String o,
			String p, String q, String r, String s, String t) {
		super();
		this.id = id;
		this.email = email;
		this.data_hora = data_hora;
		this.campus = campus;
		this.modalidade = modalidade;
		this.periodo = periodo;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
		this.m = m;
		this.n = n;
		this.o = o;
		this.p = p;
		this.q = q;
		this.r = r;
		this.s = s;
		this.t = t;
	}

	public RespostaDTO (Resposta resposta) {
		id = resposta.getId();
		email = resposta.getEmail();
		setData_hora(resposta.getData_hora());
		campus = resposta.getCampus();
		modalidade = resposta.getModalidade();
		periodo = resposta.getPeriodo();
		f = resposta.getF();
		g = resposta.getG();
		h = resposta.getH();
		i = resposta.getI();
		j = resposta.getJ();
		k = resposta.getK();
		l = resposta.getL();
		m = resposta.getM();
		n = resposta.getN();
		o = resposta.getO();
		p = resposta.getP();
		q = resposta.getQ();
		r = resposta.getR();
		s = resposta.getS();
		t = resposta.getT();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Instant getData_hora() {
		return data_hora;
	}

	public void setData_hora(Instant data_hora) {
		this.data_hora = data_hora;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public String getH() {
		return h;
	}

	public void setH(String h) {
		this.h = h;
	}

	public String getI() {
		return i;
	}

	public void setI(String i) {
		this.i = i;
	}

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getO() {
		return o;
	}

	public void setO(String o) {
		this.o = o;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RespostaDTO other = (RespostaDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
