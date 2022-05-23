package exam;

public class ColorTV extends TV {
	
	private int size;

	
	public ColorTV(int inch,int color) {
		super(inch, color);
		this.size = size;
	
	}
		void printProperty() {	
			System.out.println(inch +"인치"+color+"컬러");
			return size;
		}
	
	
	
	

}
