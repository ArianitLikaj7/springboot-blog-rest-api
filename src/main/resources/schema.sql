CREATE TABLE posts (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       description VARCHAR(255) NOT NULL,
                       content TEXT NOT NULL
);
