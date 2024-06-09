package dev.rumesh.homelibrary.web.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import dev.rumesh.homelibrary.domain.Book;
import dev.rumesh.homelibrary.web.dto.BookDto;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {

    @Mapping(source = "publishDate", target = "publishDate", dateFormat = "yyyy-MM-dd")
    BookDto toDto(Book book);
}
