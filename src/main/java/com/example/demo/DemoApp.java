package com.example.demo;

public class DemoApp {
    DemoApp(int x, int y){
      int z=x+y;
    }

public static void main ( String []  args){
    Employee emp = new Employee();
    emp.setId("12345");
    emp.setEmpName("Syed Faisal");
    emp.setMailId("faisalsyed@gmail.com");


   DemoApp demoApp = new DemoApp(10,20);
    System.out.println(demoApp);
    System.out.println(emp);
}
}

