package com.example.demo.OneToManyMapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollageRepository extends JpaRepository<Collage,Integer> {
}
