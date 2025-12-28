package com.opencode.alumxbackend.jobposts.repository;

import com.opencode.alumxbackend.jobposts.model.JobPostLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostLikeRepository extends JpaRepository<JobPostLike,Long> {
    boolean existsByPostIdAndUserId(String postId, Long userId);
}
