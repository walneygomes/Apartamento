
public abstract class Apartamento {
	private int idMorador;
	private int andar;
	private String nomeMorador;

	public abstract void reservar();

	public abstract void aluguel();

	public int getIdMorador() {
		return idMorador;
	}

	public void setIdMorador(int idMorador) {
		this.idMorador = idMorador;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getNomeMorador() {
		return nomeMorador;
	}

	public void setNomeMorador(String nomeMorador) {
		this.nomeMorador = nomeMorador;
	}

}
