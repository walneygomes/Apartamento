
public class FactoryApartamento {

	public Apartamento obterApartamento(String tipo) {
		Apartamento apartamento = null;
		if ("normal".equals(tipo)) {
			apartamento = new ApartamentoSimples();
		} else if ("Vip".equals(apartamento)) {
			if ("".equals(ApartamentoVip.obterApartamento().getNomeMorador())) {
				apartamento = ApartamentoVip.obterApartamento();
			} else {
				System.out.print("Apartamento em uso");
				apartamento = new ApartamentoSimples();
			}

		}
		return apartamento;
	}

}
