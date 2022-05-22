package com.example.trainingspring.infrastructure.datasource;

import com.example.trainingspring.application.form.dto.UserCommentDto;
import com.example.trainingspring.domain.model.UserComment;
import com.example.trainingspring.domain.model.UserCommentRepository;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class UserCommentDatasource implements UserCommentRepository {
    private final UserCommentMapper mapper;

    @Override
    public void save(UserComment userComment) {
        mapper.Insert(UserCommentDto.from(userComment));
    }
}
