package com.wilsomani.demospringkotlin2.repositories

import com.wilsomani.demospringkotlin2.model.Publisher
import org.springframework.data.repository.CrudRepository

interface PublisherRepository: CrudRepository<Publisher, Long>