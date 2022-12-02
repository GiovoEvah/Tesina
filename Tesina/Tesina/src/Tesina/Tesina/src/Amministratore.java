
public class Amministratore extends Utente{
	private boolean isadmin;
	
	public Amministratore(String nome, String cognome, String codfisc,int matricola, String password, String email, String iban, String codturno) {
		super(nome, cognome, codfisc, matricola, password, email, iban, codturno);
		setIsadmin(true);
	}

	public boolean isIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = true;
	}

	@Override
	public String toString() {
		return super.toString() + "\nE' un amministratore.\n";
	}
	
	
	
}
