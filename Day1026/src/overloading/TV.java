package overloading;

public class TV {
	private String manufacturer;
	private int year;
	private int inch;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}

	public TV(String manufacturer,int year, int inch) {
		this.manufacturer=manufacturer;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(manufacturer+ "에서 만든 " +year+ " 년형 " +inch+ "인치 TV");
	}
}
