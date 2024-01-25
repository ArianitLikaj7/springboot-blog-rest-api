    package com.springboot.blog.service.impl;

    import com.springboot.blog.configMapper.PostMapper;
    import com.springboot.blog.entity.Post;
    import com.springboot.blog.exception.ResourceNotFoundException;
    import com.springboot.blog.payload.PostDto;
    import com.springboot.blog.repository.PostRepository;
    import com.springboot.blog.service.PostService;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;
    import java.util.stream.Collectors;


    @Service
    public class PostServiceImpl implements PostService {

        private final PostRepository postRepository;
        private final PostMapper postMapper;

        @Autowired
        public PostServiceImpl(PostRepository postRepository,PostMapper postMapper) {
            this.postRepository = postRepository;
            this.postMapper = postMapper;
        }

        @Override
        public PostDto createPost(PostDto postDto) {
            Post post = postMapper.mapToEntity(postDto);
            Post newPost = postRepository.save(post);
            return postMapper.mapToDto(newPost);
        }

        @Override
        public List<PostDto> getAllPosts() {
            List<Post> posts = postRepository.findAll();
            return posts.stream()
                    .map(postMapper::mapToDto)
                    .collect(Collectors.toList());
        }


        @Override
        public PostDto getPostById(long id) {
           Post post = postRepository.findById(id)
                   .orElseThrow(()-> new ResourceNotFoundException("Post","id", id));
           return postMapper.mapToDto(post);
        }

        @Override
        public PostDto updatePost(PostDto postDto, long postId) {
         Post existingPost = postRepository.findById(postId)
                 .orElseThrow(()-> new ResourceNotFoundException("Post","id", postId));
         existingPost.setTitle(postDto.getTitle());
         existingPost.setDescription(postDto.getDescription());
         existingPost.setContent(postDto.getContent());
         existingPost = postRepository.save(existingPost);
         return postMapper.mapToDto(existingPost);
        }

        @Override
        public void deletePostById(long id) {
            Post post = postRepository.findById(id)
                    .orElseThrow(()-> new ResourceNotFoundException("Post","id", id));
            postRepository.deleteById(id);
        }
    }