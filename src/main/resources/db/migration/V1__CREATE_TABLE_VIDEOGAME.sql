CREATE TABLE video_game
(
    id           bigserial    NOT NULL,
    title        varchar(100) NULL,
    genre        varchar(100) NULL,
    release_date integer      NULL,
    developer    varchar(100) NULL,
    publisher    varchar(100) NULL,
    CONSTRAINT video_game_pk PRIMARY KEY (id)
)
