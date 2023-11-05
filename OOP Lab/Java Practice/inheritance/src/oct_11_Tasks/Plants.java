package oct_11_Tasks;

class PlantClass{
	
	public
	void display() {
	System.out.println("This is Plant Class.");	
	}
};
	
	class Trees extends PlantClass{
	public
	void treeDisplay() {
		System.out.println("This is Tree Class!");
	}
	};
	class Fruits extends Trees{
		public
		void display() {
			System.out.println("This is Friuts Class!");
		}
	};
	class NonFruits extends Trees{
		public
		void display() {
			System.out.println("This is Non-Friuts Class!");
		}
	};

	class Bushes extends Plants{
		public
		void display() {
			System.out.println("This is Bushes Class!");
		} 
	};


public class Plants {

	public static void main(String[] args) {
		
	PlantClass p1 = new PlantClass();
	p1.display();

	Trees t1= new Trees();
	t1.treeDisplay();
	
	Fruits ff1 = new Fruits();
	ff1.display();
	
	NonFruits nn1 = new NonFruits();
	nn1.display();
	
	Bushes b1 = new Bushes();
	b1.display();
	}

}
