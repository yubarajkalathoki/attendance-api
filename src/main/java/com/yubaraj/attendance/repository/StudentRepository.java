/**
 * 
 */
package com.yubaraj.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yubaraj.attendance.entity.Student;

/**
 * Repository for student register.
 * 
 * @author Yuba Raj Kalathoki
 * @version 0.1.0
 * @since 0.1.0
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
