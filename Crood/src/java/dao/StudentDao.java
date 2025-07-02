package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

import util.DbUtil;

public class StudentDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static List<Student> getAllstudent() {
        List<Student> Student = new ArrayList<>();
        sql = "select * from Student";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("subject"),
                        rs.getFloat("fee")
                );

                Student.add(s);

            }

            rs.close();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Student;
    }

    public static int saveStu(Student s) {
        int status = 0;
        sql = "insert into Student(name, email, subject, fee) values(?,?,?,?)";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getSubject());
            ps.setFloat(4, s.getFee());

            status = ps.executeUpdate();

            System.out.println(status);

            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public static void deletStu(int id) {

        sql = "delete from student where id=?";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            System.getLogger(StudentDao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    public static Student getById(int id) {
        Student s = null;
        sql = "select * from student where id=?";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("subject"),
                        rs.getFloat("fee")
                );
            }

            rs.close();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    public static int updateStudent(Student s) {
        int status = 0;
        sql = "update employee set name= ?, email= ?, subject= ?, fee=?, where id=?";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getSubject());
            ps.setFloat(4, s.getFee());
            ps.setInt(5, s.getId());

            status = ps.executeUpdate();
            System.out.println(status);

            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

}
