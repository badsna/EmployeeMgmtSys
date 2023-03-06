package com.example.employeemgmtsys.service.teacherservice;

import com.example.employeemgmtsys.model.Teacher;
import com.example.employeemgmtsys.pojo.teacher.TeacherDetailRequestPojo;

import java.util.List;

public interface TeacherService {
List<Teacher> getTeachers();
    public Teacher saveTeacherDetails(TeacherDetailRequestPojo teacherDetailRequestPojo);
    public void deleteEmployeeById(Long id);
    Teacher getTeacherById(Long id);
    Teacher updateEmployee(Teacher teacher );
    }
