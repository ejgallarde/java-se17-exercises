package chapter_5_Improved_Class_Design.enums;

public enum DiaperSizes {
	
	NEW_BORN("0-3 kgs", "NB"),
	THREE_MONTHS("3-8 kgs", "S"),
	SIX_MONTHS("6-13 kgs", "M");
	
	private String weight;
	private String size;
	
	private DiaperSizes(String weight, String size) {
		this.weight = weight;
		this.size = size;
	}

	public String getWeight() {
		return weight;
	}

	public String getSize() {
		return size;
	}

}
