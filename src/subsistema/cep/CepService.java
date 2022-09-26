package subsistema.cep;

public class CepService {
	private static CepService instancia = new CepService();

	private CepService() {
		super();
	}

	public static CepService getInstancia() {
		return instancia;
	}

	public String recuperarCidade(String cep) {
		return "Bras�lia";
	}

	public String recuperarEstado(String cep) {
		return "DF";
	}

}
