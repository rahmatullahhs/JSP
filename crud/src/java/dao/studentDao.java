package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import util.DbUtil;

public class StudentDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    //Get All Employees Details From Database
    public static List<Student> getAllEmployees() {
        List<Student> students = new ArrayList<>();
        sql = "select * from employee";
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                s
                        Student student = new Student(id, name, designation, salary);
                Student.add(student);
            }

            rs.close();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return students;
    }

    //Set Employee Details To Database
    public static int setEmployee(Student student) {
        int status = 0;
        sql = "insert into employee(name, designation, salary)values(?,?,?)";
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getDesignation());
            ps.setDouble(3, student.getSalary());
            status = ps.executeUpdate();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return status;
    }

    //Get Employee Details By Id
    public static Student getEmployeeByID(int id) {
        Student student = new Student();
        sql = "select * from employee where id = ?";
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                Student s = new Student(idl, name, designation, salary);
            }
            rs.close();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return student;
    }

    //Update Employee Details
    public static int updateEmployee(Student employee) {
        int status = 0;
        sql = "update employee set name = ?, designation = ?, salary = ? where id = ?";
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDesignation());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getId());
            status = ps.executeUpdate();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return status;
    }

    //Delete Employee From Database
    public static int deleteEmployee(int id) {
        int status = 0;
        sql = "delete from employee where id = ?";
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return status;
    }

}