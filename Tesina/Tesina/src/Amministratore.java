
public class Amministratore extends Utente{
	private boolean isadmin;
	
	public Amministratore(String nome, String cognome, String codfisc,int matricola, String password, String email, String iban) {
		super(nome, cognome, codfisc, matricola, password, email, iban);
		setIsadmin(true);
	}

	public boolean isIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}

	@Override
	public String toString() {
		return super.toString() + "\nE' un amministratore.\n";
	}
	
	
	
}
