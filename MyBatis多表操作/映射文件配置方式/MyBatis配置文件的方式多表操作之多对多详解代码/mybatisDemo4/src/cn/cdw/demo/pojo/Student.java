package cn.cdw.demo.pojo;

import java.util.List;

/**
 * @author DW-CHEN
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;

    private List<Course> courseList;

    public Student() {

    }
    public Student(Integer id, String name, Integer age, List<Course> courseList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courseList = courseList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", courseList=" + courseList +
                '}';
    }
}
