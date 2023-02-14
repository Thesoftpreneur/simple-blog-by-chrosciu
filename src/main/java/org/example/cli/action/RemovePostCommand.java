package org.example.cli.action;

import org.example.post.service.PostService;

import java.util.Scanner;

public class RemovePostCommand implements Command {
    @Override
    public void execute(PostService postService, Scanner scanner) {
        System.out.println("Enter post id:");
        var postId = scanner.nextInt();
        postService.removePost(postId);
        System.out.println("Removed post with id: " + postId);
    }
}