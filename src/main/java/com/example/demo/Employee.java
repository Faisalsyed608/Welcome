package com.example.demo;

public class Employee {

    private String id;
    private String empName;
    private String mailId;

    public void  setId(String id)
    {
        this.id=id;
    }
    public String getId(String id){
        return this.id=id;
    }
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    public String getEmpName(String empName)
    {
        return this.empName=empName;
    }
    public void setMailId(String mailId)
    {
        this.mailId=mailId;
    }
    public String getMailId(String mailId)
    {
        return this.mailId=mailId;
    }




    @Override
    public String toString() {
        return " Employee [id=" +id + ", empName=" + empName +","+ "emaild="+mailId+"]";
    }


}
