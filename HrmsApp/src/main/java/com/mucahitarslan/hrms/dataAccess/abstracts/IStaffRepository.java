package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Resume;
import com.mucahitarslan.hrms.entity.concretes.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStaffRepository extends JpaRepository<Staff,Long> {

}
