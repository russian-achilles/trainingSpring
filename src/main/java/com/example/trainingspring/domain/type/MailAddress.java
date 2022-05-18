package com.example.trainingspring.domain.type;

import java.util.Objects;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MailAddress {
    private final String value;

    public static MailAddress from(String mailAddress) {
        return new MailAddress(mailAddress);
    }

    @Override
    public String toString() {
        if (Objects.isNull(this.value)) {
            return "";
        }
        return this.value;
    }
}
