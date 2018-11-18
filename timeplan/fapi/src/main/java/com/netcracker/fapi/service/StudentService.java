package com.netcracker.fapi.service;

import com.netcracker.fapi.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class StudentService {


    @Value("${backend.server.url}")
    private String backendServerUrl;


    public List<Student> getAllStudent() {
        RestTemplate restTemplate = new RestTemplate();
        Student[] students = restTemplate.getForObject(backendServerUrl + "/api/student/getall", Student[].class);
        return students  == null ? Collections.emptyList() :Arrays.asList(students);
    }

    public Student getStudentAccount(int id) {
        return null;
    }

    public Student saveStudentAccount(Student student) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/student", student, Student.class).getBody();
    }

    public void deleteStudentAccount(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/student/"+id);
    }


    public List<Student> getAllStudentsNotGroup(){
        RestTemplate restTemplate = new RestTemplate();
        Student[] students = restTemplate.getForObject(backendServerUrl + "/api/student/notgroup", Student[].class);
        return  Arrays.asList(students);
    }


}
