package org.example.cli.action;

import org.example.post.service.PostService;
import java.util.Scanner;

class ExitApplicationCommand implements Command {
    @Override
    public void execute(PostService postService, Scanner scanner) {
        System.out.println("Thank you");
    }
}
