public static void main(String[] args) {
		/*
		 * BankAccount
		 */
		BankAccount acc1  =new BankAccount (1000,-1000, "Lisa");
		BankAccount acc2  =new BankAccount (1000,-1000, "Bob");
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		acc1.transfer(acc2, 500);
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		acc1.transfer(acc2, 1600);
		/*
		 * Rectangle
		 */
        Rectangle rect1 = new Rectangle(1, 5);
        Rectangle rect2 = new Rectangle(2, 4);
        rect1.draw();
        
        rect2.draw();
        rect1.scale(2);
        System.out.println(rect1.calcPerimeter() + rect2.calcPerimeter());
        System.out.println(rect1.calcArea() + rect2.calcArea());
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());

	}
