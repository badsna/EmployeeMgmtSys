package com.example.employeemgmtsys.controller;

import com.example.employeemgmtsys.model.Teacher;
import com.example.employeemgmtsys.pojo.teacher.TeacherDetailRequestPojo;
import com.example.employeemgmtsys.service.teacherservice.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
// url ma /user paxe j j auxa tao yo controller ma janxa
@RequestMapping("/user")
public class UserController {
private final TeacherService teacherService;

    public UserController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @RequestMapping("/")
    public String home(Model model){
    //user folder vitra ko home
    model.addAttribute("data",teacherService.getTeachers());
        return "user/home";
    }

    @GetMapping("/addEmployee")
    public String addNewEmployee(){

        return "user/addEmployee";
    }
    @PostMapping("/teacher")
    public String saveTeacherDetails(@ModelAttribute TeacherDetailRequestPojo teacherDetailRequestPojo){
    teacherService.saveTeacherDetails(teacherDetailRequestPojo);
    return "redirect:/user/";

    }
    @GetMapping("{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        teacherService.deleteEmployeeById(id);
        return "redirect:/user/";
    }

    @GetMapping("/updateEmployee/{id}")
    public String updateEmployeeForm(@PathVariable Long id, Model model)
    {
       Teacher teacher= teacherService.getTeacherById(id);
        model.addAttribute("teacher",teacher);
        return "user/updateEmployee";

    }

//
//    @PostMapping("/teacher/{id}")
//    public String updateEmployee(@PathVariable Long id,
//    @ModelAttribute("teacher") Teacher teacher,
//                                 Model model){
//        Teacher existingteacher=teacherService.getTeacherById(id);
//        existingteacher.setTeacher_id(id);
//        existingteacher.setTeacher_name(teacher.getTeacher_name());
//        existingteacher.setAddress(teacher.getAddress());
//        existingteacher.setDob(teacher.getDob());
//        existingteacher.setEmail(teacher.getEmail());
//        existingteacher.setPhone(teacher.getPhone());
//
//        teacherService.updateEmployee(existingteacher);
//        return "redirect:/user/";
//
//    }

}
