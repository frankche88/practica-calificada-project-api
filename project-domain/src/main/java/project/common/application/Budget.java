package project.common.application;

import java.math.BigDecimal;

public class Budget {
	
	private BigDecimal value = BigDecimal.ZERO;
	
	private String currency = "";
	
	protected Budget() {
		
	}
	
	public Budget(BigDecimal value, String currency) {
		super();
		this.value = value;
		this.currency = currency;
	}

	public BigDecimal getValue() {
		return value;
	}

	public String getCurrency() {
		return currency;
	}

	protected void setValue(BigDecimal value) {
		this.value = value;
	}

	protected void setCurrency(String currency) {
		this.currency = currency;
	}
	
	

}
