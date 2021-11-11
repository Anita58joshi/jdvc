package com.nepalaya.jdvc.service.impl;

import com.nepalaya.jdvc.builder.ResponseBuilder;
import com.nepalaya.jdvc.dao.StudentDAO;
import com.nepalaya.jdvc.dao.impl.StudentDAODatabaseImpl;

import com.nepalaya.jdvc.exception.ResponseProcessor;
import com.nepalaya.jdvc.models.Student;
import com.nepalaya.jdvc.response.Response;
import com.nepalaya.jdvc.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentDAO studentDAO = new StudentDAODatabaseImpl();

    @Override
    public Response add(Student student) {
        return ResponseProcessor
                .process(() -> {
                            studentDAO.add(student);
                            return ResponseBuilder.success("Student Added Successfully !");
                        }
                );
    }

    @Override
    public Response update(Student student) {
        return ResponseProcessor
                .process(() -> {
                            studentDAO.update(student);
                            return ResponseBuilder.success("Student Updated Successfully !");
                        }
                );
    }

    @Override
    public Response delete(Long id) {
        return ResponseProcessor
                .process(() -> {
                    studentDAO.delete(id);
                    return ResponseBuilder.success("Student's Deleted Successfully !");
                });
    }

    @Override
    public Response getAll() {
        return ResponseProcessor
                .process(() -> ResponseBuilder.success("Student's Fetched Successfully !", studentDAO.getAll()));
    }

    @Override
    public Response getById(Long id) {
        return ResponseProcessor
                .process(() -> ResponseBuilder.success("Student Fetched Successfully !", studentDAO.getById(id)));
    }
}