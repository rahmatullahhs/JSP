
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import util.DatabaseConnection;

public class StudentDao {
    package dao;


public class EmployeeDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    //Get All Employees Details From Database
    public static List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        sql = "select * from employee";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                Employee employee = new Employee(id, name, designation, salary);
                employees.add(employee);
            }

            rs.close();
            ps.close();
            DatabaseConnection.getConnection().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmployeeDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return employees;
    }

    //Set Employee Details To Database
    public static int setEmployee(Employee employee) {
        int status = 0;
        sql = "insert into employee(name, designation, salary)values(?,?,?)";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDesignation());
            ps.setDouble(3, employee.getSalary());
            status = ps.executeUpdate();
            ps.close();
            DatabaseConnection.getConnection().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmployeeDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return status;
    }

    //Get Employee Details By Id
    public static Employee getEmployeeByID(int id) {
        Employee employee = new Employee();
        sql = "select * from employee where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                employee = new Employee(id1, name, designation, salary);
            }
            rs.close();
            ps.close();
            DatabaseConnection.getConnection().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmployeeDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return employee;
    }

    //Update Employee Details
    public static int updateEmployee(Employee employee) {
        int status = 0;
        sql = "update employee set name = ?, designation = ?, salary = ? where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDesignation());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getId());
            status = ps.executeUpdate();
            ps.close();
            DatabaseConnection.getConnection().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmployeeDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return status;
    }

    //Delete Employee From Database
    public static int deleteEmployee(int id) {
        int status = 0;
        sql = "delete from employee where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmployeeDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return status;
    }

}
}
