import java.io.Serializable;


public class Message implements Serializable{
	private static final long serialVersionUID = 1L;
	private String contenu;
	public Message(String line) {
		contenu = line;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
}
