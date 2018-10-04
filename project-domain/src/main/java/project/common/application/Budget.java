package project.common.application;

import java.math.BigDecimal;

public class Budget {
	
	private BigDecimal value = BigDecimal.ZERO;
	
	private String currency = "";
	
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
	
	

}
