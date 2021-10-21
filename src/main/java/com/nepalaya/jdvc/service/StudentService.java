package com.nepalaya.jdvc.service;

import com.nepalaya.jdvc.models.Student;
import com.nepalaya.jdvc.response.Response;

import java.util.List;

public interface StudentService {

    Response add(Student student); //CREATE

    Response update(Student student); //UPDATE

    Response delete(Long id); //DELETE

    Response getAll(); //READ

    Response getById(Long id); //READ

}
