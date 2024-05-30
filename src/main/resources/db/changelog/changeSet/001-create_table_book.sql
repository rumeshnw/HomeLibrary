--liquibase formatted sql
--changeset rumeshnw:1

CREATE TABLE `book` (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(100) NOT NULL,
    info_url VARCHAR(255),
    preview_url VARCHAR(255),
    thumbnail_url VARCHAR(255),
    publish_date DATE,
    number_of_pages INT,
    UNIQUE(isbn),
    INDEX (title)
);