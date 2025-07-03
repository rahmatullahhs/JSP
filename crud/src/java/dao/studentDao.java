package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.student;
import util.DbUtil;

public class studentDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    //Get All Employees Details From Database
    public static List<student> getAllEmployees() {
        List<student> students = new ArrayList<>();
        sql = "select * from employee";
        try {
            ps = DbUtil.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                student student = new student(id, name, designation, salary);
                student.add(student);
            }

            rs.close();
            ps.close();
            DbUtil.getConnection().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(studentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return students;
    }

    //Set Employee Details To Database
    public static int setEmployee(student student) {
        int status = 0;
        sql = "insert into employee(name, designation, salary)values(?,?,?)";
        try {
            ps = DbUtil.getConnection().prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getDesignation());
            ps.setDouble(3, student.getSalary());
            status = ps.executeUpdate();
            ps.close();
            DbUtil.getConnection().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(studentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return status;
    }

    //Get Employee Details By Id
    public static student getEmployeeByID(int id) {
        student student = new student();
        sql = "select * from employee where id = ?";
        try {
            ps = DbUtil.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                student = new student(id1, name, designation, salary);
            }
            rs.close();
            ps.close();
            DbUtil.getConnection().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(studentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return student;
    }

    //Update Employee Details
    public static int updateEmployee(student employee) {
        int status = 0;
        sql = "update employee set name = ?, designation = ?, salary = ? where id = ?";
        try {
            ps = DbUtil.getConnection().prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDesignation());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getId());
            status = ps.executeUpdate();
            ps.close();
            DbUtil.getConnection().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(studentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return status;
    }

    //Delete Employee From Database
    public static int deleteEmployee(int id) {
        int status = 0;
        sql = "delete from employee where id = ?";
        try {
            ps = DbUtil.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(studentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return status;
    }

}