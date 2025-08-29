package com.cdac.careerhub.repository;

import com.cdac.careerhub.entity.JobPostActivity;
import com.cdac.careerhub.entity.JobSeekerProfile;
import com.cdac.careerhub.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}
