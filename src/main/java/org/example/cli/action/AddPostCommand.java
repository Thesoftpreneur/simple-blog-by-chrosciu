package org.example.cli.action;

import org.example.post.service.PostService;
import org.example.post.transfer.NewPostDto;
import java.util.Scanner;

public class AddPostCommand implements Command {
    @Override
    public void execute(PostService postService, Scanner scanner) {
        System.out.println("Enter post title:");
        var title = scanner.nextLine();
        System.out.println("Enter post content:");
        var content = scanner.nextLine();
        var newPostDto = new NewPostDto(title, content);
        var newPostId = postService.addPost(newPostDto);
        System.out.println("Added post with id: " + newPostId);
    }
}
