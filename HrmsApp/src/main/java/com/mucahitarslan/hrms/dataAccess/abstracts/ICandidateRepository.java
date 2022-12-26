package com.mucahitarslan.hrms.dataAccess.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobSeekerRepository extends JpaRepository<Candidate,Long> {
    boolean existsByMail(String mail);
    boolean existsByIdentityId(String identityId);

}
