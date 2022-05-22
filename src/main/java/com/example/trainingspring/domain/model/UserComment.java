package com.example.trainingspring.domain.model;

import com.example.trainingspring.domain.type.Comment;
import com.example.trainingspring.domain.type.MailAddress;
import com.example.trainingspring.domain.type.Name;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserComment {
    private final Name name;
    private final MailAddress mailAddress;
    private final Comment comment;

    public static UserComment from(String name, String mailAddress, String comment) {
        return new UserComment(Name.from(name), MailAddress.from(mailAddress), Comment.from(comment));
    }
}
