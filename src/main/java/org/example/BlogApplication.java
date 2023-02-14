package org.example;

import org.example.cli.BlogCli;
import org.example.post.model.Post;
import org.example.post.service.PostService;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogApplication {

    public static void main(String[] args) {
        var posts = new ArrayList<Post>();
        var postService = new PostService(posts);
        var scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

//        postService.addPost(new org.example.post.transfer.NewPostDto(
//            "Debugger sucks",
//            "I cannot find any bug in my app, give me something better !")
//        );
//        postService.addPost(new org.example.post.transfer.NewPostDto(
//            "Sneaky streams",
//            "What really happens in this inferno ?")
//        );

        var blogCli = new BlogCli(postService, scanner);

        blogCli.run();
    }
}
