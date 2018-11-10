package com.example.demo.OneToManyMapping;

import org.springframework.stereotype.Service;

@Service
public class CollageService {
    private CollageRepository collageRepository;

    public CollageService(CollageRepository collageRepository) {
        this.collageRepository = collageRepository;
    }

    public Collage save(Collage collage){
        return collageRepository.save(collage);
    }
}
