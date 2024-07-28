public enum month {
	
    JANUARY("Sankranti"), FEBRAURAY("Valentines week"), MARCH("Womens Day"), APRIL("Health Day"), MAY("May Day"), JUNE("Father Day");
    
    private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	month (String type){
		this.type=type;
	}
}

class demo2{
	public static void main(String[] args) {
    month m=month.FEBRAURAY;
		System.out.println(m.getType());
		}
}
