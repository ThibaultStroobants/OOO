package domain.model;

public enum Type {
	
	G("Game"),
	M("Movie");
	
	private String type;

	private Type(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
}
