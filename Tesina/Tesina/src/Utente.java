
public class Utente {
	private String nome;
	private String cognome;
	private String codfisc;
	private int matricola;
	private String password;
	private String email;
	private double stipendio;
	private double costoorario;
	private int oredilavoro;
	private String iban;
	private int contmatricola = 0;
	
	public Utente() {
		setNome(null);
		setCognome(null);
		setCodfisc(null);
		setMatricola(0);
		setPassword(null);
		setEmail(null);
		setStipendio(0);
		setOredilavoro(0);
		setCostoorario(0);
		setIban(null);
	}
	
	public Utente(String nome, String cognome, String codfisc, int matricola, String password, String email, String iban) {
		setNome(nome);
		setCognome(cognome);
		setCodfisc(codfisc);
		setMatricola(260000 + contmatricola);
		setPassword(password);
		setEmail(email);
		setStipendio(0);
		setOredilavoro(0);
		setCostoorario(costoorario);
		setIban(iban);
		contmatricola += 1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getCodfisc() {
		return codfisc;
	}
	public void setCodfisc(String codfisc) {
		this.codfisc = codfisc;
	}
	
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public double getCostoorario() {
		return costoorario;
	}
	public void setCostoorario(double costoorario) {
		this.costoorario = costoorario;
	}
	
	public int getOredilavoro() {
		return oredilavoro;
	}
	public void setOredilavoro(int oredilavoro) {
		this.oredilavoro = oredilavoro;
	}
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}

	@Override
	public String toString() {
		return "Utente nome=" + nome + ", cognome=" + cognome + ", codfisc=" + codfisc + ", matricola=" + matricola
				+ ", password=" + password + ", email=" + email + ", stipendio=" + stipendio + "Ore di lavoro: " + oredilavoro +  ", costoorario=" + costoorario + ", iban=" + iban + "\n";
	}
		
	/*da ultimare tostring*/
	
}
