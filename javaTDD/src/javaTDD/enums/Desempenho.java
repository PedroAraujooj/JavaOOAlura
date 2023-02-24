package javaTDD.enums;

import java.math.BigDecimal;

public enum Desempenho {
	BAIXO{

		@Override
		public BigDecimal getPercentual() {
			// TODO Auto-generated method stub
			return new BigDecimal("1.03");
		}
		
	},
	
	BOM{

		@Override
		public BigDecimal getPercentual() {
			// TODO Auto-generated method stub
			return new BigDecimal("1.15");
		}
		
	}, 
	
	OTIMO{

		@Override
		public BigDecimal getPercentual() {
			// TODO Auto-generated method stub
			return new BigDecimal("1.2");
		}
		
	};
	
	public abstract BigDecimal getPercentual();

}
