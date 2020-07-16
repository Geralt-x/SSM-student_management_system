package com.student.service;

import com.student.dao.StudentDao;
import com.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

   @Autowired
   private StudentDao studentdao;

    @Override
    public int getTotal() {
        return studentdao.getTotal();
    }

    @Override
    public void addStudent(Student student) {
      studentdao.addStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
      studentdao.deleteStudent(id);
    }

    @Override
    public void updateStudent(Student student) {
     studentdao.updateStudent(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentdao.getStudent(id);
    }

    @Override
    public List<Student> list(int start, int count) {
        return studentdao.list(start,count);
    }
}
