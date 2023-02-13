package org.example.post.service;

import org.example.post.exception.PostException;
import org.example.post.model.Post;
import org.example.post.transfer.NewPostDto;
import org.example.post.transfer.PostContentDto;
import org.example.post.transfer.ShortPostDto;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostService {
    private final List<Post> posts;

    public List<ShortPostDto> getAllPosts() {
        return posts.stream()
            .map(post -> new ShortPostDto(post.getId(), post.getTitle()))
            .collect(Collectors.toList());
    }

    public List<ShortPostDto> searchPosts(String query) {
        return posts.stream()
            .filter(post -> post.getTitle().contains(query) || post.getContent().contains(query))
            .map(post -> new ShortPostDto(post.getId(), post.getTitle()))
            .collect(Collectors.toList());
    }

    public Optional<PostContentDto> getPost(int postId) {
        return posts.stream()
            .filter(post -> postId == post.getId())
            .map(post -> new PostContentDto(post.getContent()))
            .findFirst();
    }

    public int addPost(NewPostDto newPostDto) {
        if (newPostDto.getTitle().length() > 20) {
            throw new PostException("Title is too long! (may be up to 20 characters)");
        }
        int maxId = posts.stream().mapToInt(Post::getId).max().orElse(-1);
        int newId = maxId + 1;
        posts.add(new Post(newId, newPostDto.getTitle(), newPostDto.getContent()));
        return newId;
    }
}
