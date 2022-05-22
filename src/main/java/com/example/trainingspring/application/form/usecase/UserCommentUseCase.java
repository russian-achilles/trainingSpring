package com.example.trainingspring.application.form.usecase;

import com.example.trainingspring.application.form.CommentForm;
import com.example.trainingspring.domain.model.UserComment;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserCommentUseCase {
    /**
     * ユーザーの書き込みをDBに格納し、表示するデータをプレゼンテーション層に渡す
     * @param commentForm ユーザーの書き込み
     * @return 表示するデータ
    */ 
    public void write(CommentForm commentForm) {
        UserComment userComment = UserComment.from(commentForm.getName(), commentForm.getMailAddress(),
                commentForm.getComment());
    }
}
