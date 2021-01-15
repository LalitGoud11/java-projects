package exceptions;

enum Enum {

	RED("RED Colour love"), BLACK("BLACK Colour");

	private String colour;

	private Enum(String s) {
		colour = s;
	}

	public String getColour() {
		return colour;
	}
}