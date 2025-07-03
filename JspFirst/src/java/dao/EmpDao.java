package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import util.DbUtil;

public class EmpDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static List<Employee> getAllemployee() {
        List<Employee> employees = new ArrayList<>();
        sql = "select * from employee";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Employee s = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("designation"),
                        rs.getFloat("salary")
              );

                employees.add(s);

            }

            rs.close();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employees;
    }

    public static int saveEmp(Employee s) {
        int status = 0;
        sql = "insert into employee(name, designation, salary) values(?,?,?)";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getDesignation());
            ps.setFloat(3, s.getSalary());

            status = ps.executeUpdate();
            System.out.println(status);

            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public static void deletEmp(int id) {

        sql = "delete from employee where id=?";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            System.getLogger(EmpDao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    public static Employee getById(int id) {
        Employee s = null;
        sql = "select * from employee where id=?";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                s = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"), 
                        rs.getString("designation"),
                        rs.getFloat("salary")
                );
            }

            rs.close();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    public static int updateEmployee(Employee s) {
        int status = 0;
        sql = "update employee set name= ?, designation= ?, salary=? where id=?";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getDesignation());
            ps.setFloat(3, s.getSalary());
            ps.setInt(4, s.getId());

            status = ps.executeUpdate();
            System.out.println(status);

            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

}
