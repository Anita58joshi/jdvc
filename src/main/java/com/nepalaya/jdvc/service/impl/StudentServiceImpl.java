package com.nepalaya.jdvc.service.impl;

import com.nepalaya.jdvc.builder.ResponseBuilder;
import com.nepalaya.jdvc.dao.StudentDAO;
import com.nepalaya.jdvc.dao.impl.StudentDAODatabaseImpl;
import com.nepalaya.jdvc.dao.impl.StudentDAOMemoryImpl;
import com.nepalaya.jdvc.models.Student;
import com.nepalaya.jdvc.response.Response;
import com.nepalaya.jdvc.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {


    private StudentDAO studentDAO = new StudentDAODatabaseImpl();


    @Override
    public Response add(Student student) {
        Response response =null;
       try {
           studentDAO.add(student);
           response = ResponseBuilder.success("Student Added Successfully !");
       }catch(Exception ex){
           response = ResponseBuilder.failure(ex.getMessage());
       }
        return response;
    }

    @Override
    public Response update(Student student) {
        Response response =null;
        try {
            studentDAO.update(student);
            response = ResponseBuilder.success("Student Updated Successfully !");
        }catch(Exception ex){
            response = ResponseBuilder.failure(ex.getMessage());
        }
        return response;
    }

    @Override
    public Response delete(Long id) {
        return null;
    }

    @Override
    public Response getAll() {
        Response response =null;
        try {
            List<Student> students = studentDAO.getAll();
            response = ResponseBuilder.success("Student Fetched Successfully !",students);
        }catch(Exception ex){
            response = ResponseBuilder.failure(ex.getMessage());
        }
        return response;
    }

    @Override
    public Response getById(Long id) {
        Response response =null;
        try {
            Student student = studentDAO.getById(id);
            response = ResponseBuilder.success("Student Fetched Successfully !",student);
        }catch(Exception ex){
            response = ResponseBuilder.failure(ex.getMessage());
        }
        return response;
    }
}
