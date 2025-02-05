package org.example.cli.action;

import org.example.post.service.PostService;

import java.util.Scanner;

class ShowPostsTitlesCommand implements Command {
    @Override
    public void execute(PostService postService, Scanner scanner) {
        System.out.println("Posts:");
        for (var shortPostDto : postService.getAllPosts()) {
            System.out.println(shortPostDto.format());
        }
    }
}
