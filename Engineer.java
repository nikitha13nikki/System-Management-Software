package C;

public class Engineer {
String name;
String domain;
double sal;
int id;

public Engineer(String name, String domain, double sal, int id) {
	super();
	this.name = name;
	this.domain = domain;
	this.sal = sal;
	this.id = id;
}

@Override
public String toString() {
	return "Engineer [name=" + name + ", domain=" + domain + ", sal=" + sal + ", id=" + id + "]";
}

 
}
