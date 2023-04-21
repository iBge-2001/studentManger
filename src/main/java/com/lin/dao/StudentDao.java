package com.lin.dao;

import com.lin.domain.Academy;
import com.lin.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
//    private long st_id;
//    private String st_name;
//    private String st_profession;
//    private String st_academy;
//    private String st_class;
//    private long st_phnum;

//    private long profession_Id;
//    private String st_address;
public interface StudentDao {
    @Insert("insert into student(st_id,st_name,st_profession,st_academy,st_class,st_phnum)values(#{st_id},#{st_name},#{st_profession},#{st_academy},#{st_class},#{st_phnum})")
    public int save(Student student);
    @Update("update student set st_name = #{st_name}, st_profession = #{st_profession}, st_academy = #{st_academy} where st_id = #{st_id}")
    public int update(Student student);
    @Delete("delete from student where st_id = #{st_id}")
    public int delete(long id);
    @Select("select * from student where st_id = #{st_id}")
    public Student  getById(long id);
    @Select("select *from student")
    public List<Student> getAll();
    //concat('%',?name,'%')
    @Select("select *from student where st_id like #{object}  or st_name like #{object}  or st_profession like #{object}  or st_academy like #{object}  or st_class like #{object}  or st_phnum like #{object} ")
    public List<Student> getFuzzy(Object object);
//    @Select("<script>select *from student <where> st_id like concat('%',#{object},'%') or st_name like concat('%',#{object},'%')  or st_profession like concat('%',#{object},'%')  or st_academy concat('%',#{object},'%')  or st_class like concat('%',#{object},'%')  or st_phnum like concat('%',#{object},'%')  </where></script>")
//    @Select("select *from student where st_id like concat('%'#{object},'%') or st_name like concat('%'#{object},'%')  or st_profession like concat('%'#{object},'%')  or st_academy concat('%'#{object},'%')  or st_class like concat('%'#{object},'%')  or st_phnum like concat('%'#{object},'%')")

}
