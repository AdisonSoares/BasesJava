//Template Method
/*O padrão Template Method define o esqueleto de um algoritmo dentro
**de um método, transferindo alguns de seus passos para as subclasses.
**O template method permite que as subclasses redefinam certos passos
**de um algoritmo sem alterar a estrutura do próprio algoritmo.*/

package br.geekuniversity.secao13;
import br.geekuniversity.secao13.TreinamentoFimDaTemporada;
import br.geekuniversity.secao13.TreinamentoInicioDaTemporada;

@SuppressWarnings("unused")
public class Programa32 {

	public static void main(String[] args) {
		TreinamentoInicioDaTemporada treinoInicio = new TreinamentoInicioDaTemporada();
		TreinamentoFimDaTemporada treinoFim = new TreinamentoFimDaTemporada();
		
		treinoInicio.treinoDiario();
		System.out.println();
		
		treinoFim.treinoDiario();
		System.out.println();
	}
}
