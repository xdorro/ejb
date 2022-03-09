/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Employee;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface EmployeeDAO {
    public List<Employee> getListEmployees();
    public Employee getEmployeeById(Integer id);
    public boolean insertEmployee(Employee b);
    public boolean updateEmployee(Employee b);
    public boolean deleteEmployee(Integer id);
}
