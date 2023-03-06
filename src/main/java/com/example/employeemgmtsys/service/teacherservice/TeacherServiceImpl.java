package com.example.employeemgmtsys.service.teacherservice;

import com.example.employeemgmtsys.model.Teacher;
import com.example.employeemgmtsys.pojo.teacher.TeacherDetailRequestPojo;
import com.example.employeemgmtsys.repository.TeacherRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    public final TeacherRepo teacherRepo;
    public final ObjectMapper objectMapper;
    public List<Teacher> getTeachers()
    {
    return teacherRepo.findAll();
    }


    public Teacher saveTeacherDetails(TeacherDetailRequestPojo teacherDetailRequestPojo) {
        Teacher teacher;
        if(teacherDetailRequestPojo.getTeacher_id()!=null){
            teacher=teacherRepo.findById(teacherDetailRequestPojo.getTeacher_id()).orElse(new Teacher());
        }
        teacher=objectMapper.convertValue(teacherDetailRequestPojo,Teacher.class);
        return teacherRepo.save(teacher);
    }

    public void deleteEmployeeById(Long id){
        teacherRepo.deleteById(id);
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepo.findById(id).get();
    }

    @Override
    public Teacher updateEmployee(Teacher teacher) {

//        teacher=objectMapper.convertValue(teacherDetailRequestPojo,Teacher.class);

        return teacherRepo.save(teacher);
    }
}
