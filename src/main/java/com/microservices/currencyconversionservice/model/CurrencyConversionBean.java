package com.microservices.currencyconversionservice.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Component

@Entity
@Table(name = "exchange_value")
public class CurrencyConversionBean {
	
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private BigDecimal quantity;
	
	private BigDecimal totalCalculatedAmount;
	
	private int port;
	
	public CurrencyConversionBean() {
		
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}
	public Long getId() {
		return id;
	}
		public String getFrom() {
		return from;
	}
	
	public String getTo() {
		return to;
	}
	
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	

}
