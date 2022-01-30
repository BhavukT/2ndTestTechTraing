

package vegetableVendor;
class Employee{
    private String name; // Employee name
    private String employeeId; // Employee Id

    Employee(String name, String employeeId){ //Constructor
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName(){ //Get Name of the Employee
        return name;
    }

    public void setName(String name){//Set Name of the Employee
        this.name = name;
    }

    public String getEmployeeId(){//Get Name of the Employee ID
        return employeeId;
    }

    public void setEmployeeId(String employeeId){//Set Name of the Employee ID
        this.employeeId = employeeId;
    }
}