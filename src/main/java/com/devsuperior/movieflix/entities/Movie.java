package com.devsuperior.movieflix.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie implements Serializable {

	private static final long serialVersionUID = 8547505925796247682L;


}
