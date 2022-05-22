package com.example.trainingspring.infrastructure.datasource;

import com.example.trainingspring.application.form.dto.UserCommentDto;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCommentMapper {
    @Insert("sql/insertUserComment.sql")
    void Insert(@Param("dto") UserCommentDto dto);
}
