package com.ques3;

import java.util.Scanner;
class Member{
String name;
int age;
long phone;
String address;
float salary;
Scanner s=new Scanner(System.in);
void set(){
System.out.println("Enter the name");
name=s.next();
System.out.println("Enter the age");
age=s.nextInt();
System.out.println("Enter the phone number");
phone=s.nextLong();
System.out.println("Enter the address");
address=s.next();
System.out.println("Enter the salary");
salary=s.nextFloat();
}
void printSalary(){
System.out.println("The salary of the member is "+salary);
}
}
class Employee extends Member{
String specialization;
void set1(){
super.set();
System.out.println("Enter the specialization");
specialization=s.next();
}
}
class Manager extends Member{
String department;
void set2(){
super.set();
System.out.println("Enter the department");
department=s.next();
}
}
class MembDet{
public static void main(String[] args){
Employee e=new Employee();
e.set1();
e.printSalary();
Manager m=new Manager();
m.set2();
m.printSalary();
}
}