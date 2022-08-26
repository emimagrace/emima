package com.MyProject.MainPro.Repository;

import com.MyProject.MainPro.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
