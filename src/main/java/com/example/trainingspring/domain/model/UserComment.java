package com.example.trainingspring.domain.model;

import java.util.Random;

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

    /**
     * 名前が[!omikuji]の場合おみくじの結果を返す。
     * そうでない場合は名前を返す。
     * @return Name
     */
    public Name getName() {
        if (!name.equals("!omikuji")) {
            return name;
        }

        int random = new Random().nextInt(3);

        switch (random) {
            case 0:
                return Name.from("大吉");
            case 1:
                return Name.from("中吉");
            default:
                return Name.from("小吉");
        }
    }
}
