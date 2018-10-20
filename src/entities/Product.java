package entities;

public class Product {
	private int cond1;
	private int cond2;
	private double preco1;
	private double preco2;
	private int qt1;
	private int qt2;
	
	public Product() {
		
	}

	public Product(int cond1, int cond2, double preco1, double preco2, int qt1, int qt2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
		this.preco1 = preco1;
		this.preco2 = preco2;
		this.qt1 = qt1;
		this.qt2 = qt2;
	}

	public int getCond1() {
		return cond1;
	}

	public void setCond1(int cond1) {
		this.cond1 = cond1;
	}

	public int getCond2() {
		return cond2;
	}

	public void setCond2(int cond2) {
		this.cond2 = cond2;
	}

	public double getPreco1() {
		return preco1;
	}

	public void setPreco1(double preco1) {
		this.preco1 = preco1;
	}

	public double getPreco2() {
		return preco2;
	}

	public void setPreco2(double preco2) {
		this.preco2 = preco2;
	}

	public int getQt1() {
		return qt1;
	}

	public void setQt1(int qt1) {
		this.qt1 = qt1;
	}

	public int getQt2() {
		return qt2;
	}

	public void setQt2(int qt2) {
		this.qt2 = qt2;
	}
	
	public double total() {
		return preco1 * qt1+ preco2 * qt2;
	}
	

	

}
