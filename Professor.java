public class Professor extends Employee {
private String field;
@Override
public double calculateSalary() {
	return getHours() * 30;
//IDK
}
}
