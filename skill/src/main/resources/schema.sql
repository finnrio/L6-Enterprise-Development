CREATE TABLE skill(
    id VARCHAR PRIMARY KEY,
    skillName VARCHAR NOT NULL,
    desc VARCHAR NOT NULL,
    category VARCHAR NOT NULL,
    FOREIGN KEY(category) REFERENCES category(id)
)

CREATE TABLE category(
    id VARCHAR PRIMARY KEY,
    categoryName VARCHAR NOT NULL
)
