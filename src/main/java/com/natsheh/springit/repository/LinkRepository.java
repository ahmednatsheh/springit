package com.natsheh.springit.repository;

import com.natsheh.springit.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

}
