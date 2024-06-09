package dev.rumesh.homelibrary.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDto {
    private Long id;
    private String title;
    private String isbn;
    private String infoUrl;
    private String previewUrl;
    private String thumbnailUrl;
    private String publishDate;
    private Integer numberOfPages;
}
