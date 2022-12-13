package Abstractfactory;

public interface AbstractFactory {
	public Chicken createChicken(String type);
	public Dough createDough(String type);
}
