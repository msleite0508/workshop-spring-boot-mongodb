package com.msleite0508.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msleite0508.workshopmongo.domain.Post;
import com.msleite0508.workshopmongo.repository.PostRepository;
import com.msleite0508.workshopmongo.services.exception.ObjectNotFundException;


@Service
public class PostService {

	@Autowired
	private PostRepository repo;

		public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFundException("Objeto não encontrado"));
	}

	
}