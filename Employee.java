//5E
public abstract class Employee {
private String name;
private int hours;
public double calculateSalary() {
	return getHours() *20;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
}