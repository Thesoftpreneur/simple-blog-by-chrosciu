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
        var blogCli = new BlogCli(postService, scanner);

        blogCli.run();
    }
}
