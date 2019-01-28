package com.example.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.entities.LigneCommande;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long>{

}
