public class student1 extends course_del{
    String name="nikhita";
    String dept="BCA";
    int sem=4;
    String getname(){
        return name;
    }
    String getdept(){
        return dept;
    }
    int getsem(){
        return sem;
    }
    public static void main(String args[]){
        student1 s1=new student1();
        
        System.out.println("Name is: "+s1.getname());
        System.out.println("Department is: "+s1.getdept());
        System.out.println("Semister is: "+s1.getsem());
        String s[]=s1.getCourse();
        System.out.println("Courses are: ");
        for(String j:s){
            System.out.println(j);
        }
        int m[]= s1.getMarks();
        System.out.println("Courses for which marks is less than 40: ");
        for(int i:m){
            if(i<40){
                s1.setMarks(i);
                System.out.println(i);

            }
            else{
                System.out.println("all other marks are above 40");
            }
    }
    }
}



public class course_del {
    String[] course=new String[]{"c#","s/w testing","ml"};

    int[] marks=new int[]{38,34,46};

    public String[] getCourse() {
        return course;
    }
    public int[] getMarks() {
        return marks;
    }
    void setMarks(int m){
        if(m==38){
            System.out.print("c#: ");
        }
        if(m==34){
            System.out.print("s/w testing: ");}
    }
    }


class GeoArea {

    static double area_of_triangle(float operand_1,float operand_2)
    {
        return(0.5 * operand_1 * operand_2);
    }

    static double area_of_rectangle(float operand_1, float operand_2)
    {
        return(operand_1 * operand_2);
    }
    
}


import java.util.Scanner;
class calculator extends GeoArea{
    public static  int add(int num1,int num2){
        return num1+num2;
    }
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static int pro(int num1,int num2){
        return num1*num2;
    }
    public static float div(float num1,float num2){
        return num1/num2;
    }
    public static void main(String[] args) {
    
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1= in.nextInt();
        System.out.println("Enter the num2: ");
        int num2= in.nextInt();
        System.out.println("Enter the operation to be performed");
        System.out.println("1.Addition\n2.Subtraction\n3.Product\n4.Division\n5.areaTriangle\n6.areasquare");
        int ch= in.nextInt();
        calculator geoarea= new calculator();
        switch (ch){
            case 1:
                System.out.println("The sum of the "+num1+" and "+num2+" is: "+add(num1,num2));
                break;
            case 2:
                System.out.println("The difference of the "+num1+" and "+num2+" is: "+sub(num1,num2));
                break;
            case 3:
                System.out.println("The Product of the "+num1+" and "+num2+" is: "+pro(num1,num2));
                break;
            case 4:
                System.out.println("The Product of the "+num1+" and "+num2+" is: "+div(num1,num2));
                break;
            case 5:    
                System.out.println("Area of rectangle"+calculator.area_of_triangle(10,5));
                break;
            case 6:
                System.out.println("Area of trianle"+calculator.area_of_rectangle(10,5));
                break;
                    
        }
    }
}


class Fibonacci{
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
       
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String args[])
    {
        int N = 10;
        Fibonacci(N);
    }
}


public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) 
    {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}


public class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + getTotalSalary());
    }

    public static void main(String[] args) {
    DevOpsEngineer devOpsEngineer = new DevOpsEngineer("John Doe", 1001, 80000, 5000);
    devOpsEngineer.displayEmployeeDetails();
    }
}