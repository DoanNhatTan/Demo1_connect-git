package buoi2;

public enum enums {
	soPI("3,14"),
	sortByPoinAsc("maAsc"),
	sortByNameAsc("tenAsc");
	private String code;
	enums(String code) {this.code = code;};
	public String getCode() {return this.code;}
}
