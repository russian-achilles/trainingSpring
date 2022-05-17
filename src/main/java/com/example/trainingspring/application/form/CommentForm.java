package com.example.trainingspring.application.form;

import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import groovyjarjarantlr4.v4.runtime.misc.Nullable;
import lombok.Data;

@Data
public class CommentForm {
    @Nullable
    @Length(max = 20)
    private String name;
    @Nullable
    @Email
    @Length(max = 100)
    private String mailAddress;
    @NotNull
    @Length(min = 1, max = 400)
    private String comment;
}
