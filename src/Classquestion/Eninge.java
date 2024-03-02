package Classquestion;

public class Eninge {
	@Override
	public String toString() {
		return "Eninge [id=" + id + ", type=" + type + "]";
	}
	public Eninge(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	private int id;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
