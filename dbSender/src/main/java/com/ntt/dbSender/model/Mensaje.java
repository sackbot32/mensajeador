package com.ntt.dbSender.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;

@Document(collection = "mensaje")
@Builder
public class Mensaje {
	@Id
	String id_msg;
	
	String msg;
	
	

	@Override
	public String toString() {
		return "Mensaje [id_msg=" + id_msg + ", msg=" + msg + "]";
	}



	public String getId_msg() {
		return id_msg;
	}



	public void setId_msg(String id_msg) {
		this.id_msg = id_msg;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
