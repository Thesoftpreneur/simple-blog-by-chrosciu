package org.example.post.transfer;

import lombok.Value;

@Value
public class ShortPostDto {
    int id;
    String title;

    public String format() {
        return String.format("%d -> %s", id, title);
    }
}
