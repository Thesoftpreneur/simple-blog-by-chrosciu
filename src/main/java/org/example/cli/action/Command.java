package org.example.cli.action;

import org.example.post.service.PostService;
import java.util.Scanner;

public interface Command {
    void execute(PostService postService, Scanner scanner);
}
