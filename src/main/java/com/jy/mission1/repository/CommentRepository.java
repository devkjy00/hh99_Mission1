package com.jy.mission1.repository;

import com.jy.mission1.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    public List<Comment> findByBoardId(long id);
}
