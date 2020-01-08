package beans;

import java.util.List;

public class Employee1 {
private String empname;
private double salary;
private List<String> skills;

public List<String>getSkills(){
return skills;
}

public void setSkills(List<String> skills) {
this.skills = skills;
}

public Employee1(String empname, double salary) {
super();
this.empname = empname;
this.salary = salary;
}
public Employee1() {
super();
}
public String getEmpname() {
return empname;
}
public void setEmpname(String empname) {
this.empname = empname;
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
public void start(){
System.out.println("this is start method");
}
public void stop(){
System.out.println("this is stop method");
}


}