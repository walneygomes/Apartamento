
public class ApartamentoVip extends Apartamento {

	private static ApartamentoVip apartamentoUnico;

	private ApartamentoVip() {

	}

	public static ApartamentoVip obterApartamento() {
		if (apartamentoUnico == null) {
			apartamentoUnico = new ApartamentoVip();
		}
		return apartamentoUnico;
	}

	@Override
	public void reservar() {
		System.out.print("Apartamento reservado para" + this.getIdMorador());

	}

	@Override
	public void aluguel() {
		System.out.print("Aluguel" + "Indefinido");

	}

}
