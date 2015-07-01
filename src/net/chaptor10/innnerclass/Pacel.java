package net.chaptor10.innnerclass;

public class Pacel {
	class Content{
		private int i=11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			this.label=whereTo;
		}
		String readLabel(){
			return label;
		}		
	}
	//method of outer class
	public String ship(String dest){
		Content content=new Content();
		Destination d=new Destination(dest);
		System.out.println(d.readLabel());
		return d.readLabel();
	}

	public static void main(String[] args) {
		Pacel p1=new Pacel();
		p1.ship("Chia");
	}

}
