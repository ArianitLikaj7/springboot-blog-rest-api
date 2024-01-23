-- schema.sql

-- Create table for Post entity
CREATE TABLE posts (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       description VARCHAR(255) NOT NULL,
                       content TEXT NOT NULL
);

-- Create table for Comment entity
CREATE TABLE comments (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(255),
                          email VARCHAR(255),
                          body TEXT,
                          post_id BIGINT REFERENCES posts(id) ON DELETE CASCADE
);
