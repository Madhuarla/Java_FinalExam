/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private int empSalary;

    public int getId() {
        return empId;
    }

    public String getName() {
        return empName;
    }


    public int getSalary() {
        return empSalary;
    }

    public Employee(int empId, String empName,int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public int compareTo(Employee emp) {
        return (this.empId - emp.empId);
    }

    @Override
    public String toString() {
        return "[id=" + this.empId + ", name=" + this.empName + ",salary=" +
                this.empSalary + "]";
    }

}

