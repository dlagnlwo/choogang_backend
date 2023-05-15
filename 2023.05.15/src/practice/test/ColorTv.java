package practice.test;

public class ColorTv extends TestTv{

	//필드
	private int quality;
	//생성자
	public ColorTv(int size, int quality) {
		super(size);
		this.quality = quality;
	}
	
	protected int getQuality() {
		return quality;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + getQuality() + "컬러");
	}
}
