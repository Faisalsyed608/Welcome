package com.example.demo;

public class EmployeeMethodeDemo {
public int addition (int x, int y)
{
    int z = x + y;
    return z;
    //System.out.println(z);
}
public static void main (String [] args)
{
    EmployeeMethodeDemo emp = new EmployeeMethodeDemo();
    //emp.addition (10,20);
    System.out.println(emp.addition(10,20));
}
}
