
public class ApartamentoSimples extends Apartamento {

	@Override
	public void reservar() {
		System.out.print("Apartamento reservado para" + this.getIdMorador());

	}

	@Override
	public void aluguel() {
		System.out.print("Aluguel" + 600.00);

	}

}
