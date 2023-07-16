package com.example.restapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @GetMapping("/")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }
    @GetMapping("/{id}")
    public Post getById(@PathVariable Long id){
        return postRepository.findById(id).orElse(null);
    }
    @PostMapping
    public Post createPost(@RequestBody Post post){
        return postRepository.save(post);
    }
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable Long id,@RequestBody Post post){
        post.setId(id);
        return postRepository.save(post);
    }
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id){
        postRepository.deleteById(id);
    }
}
