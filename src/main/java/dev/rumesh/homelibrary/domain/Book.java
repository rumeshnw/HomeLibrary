package dev.rumesh.homelibrary.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String isbn;
    @Column(name = "info_url")
    private String infoUrl;
    @Column(name = "preview_url")
    private String previewUrl;
    @Column(name = "thumbnail_url")
    private String thumbnailUrl;
    @Column(name = "publish_date")
    private LocalDate publishDate;
    @Column(name = "number_of_pages")
    private Integer numberOfPages;
}
