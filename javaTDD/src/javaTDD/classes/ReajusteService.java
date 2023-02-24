package javaTDD.classes;

import javaTDD.enums.Desempenho;

public class ReajusteService {

	public void concederReajuste(Funcionario f, Desempenho desempenho) {
//		if(desempenho == Desempenho.BAIXO) {
//			f.rejustarSalario(1.03);
//		}
//		
//		if(desempenho == Desempenho.BOM) {
//			f.rejustarSalario(1.15);
//		}
//		
//		if(desempenho == Desempenho.OTIMO) {
//			f.rejustarSalario(1.2);
//		}
		
		f.rejustarSalario(desempenho.getPercentual());
	}

}
