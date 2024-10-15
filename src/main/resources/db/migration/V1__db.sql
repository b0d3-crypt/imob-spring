CREATE TABLE endereco (
    cd_endereco SERIAL PRIMARY KEY,
    ds_endereco VARCHAR(255),
    nr_cep VARCHAR(8),
    cidade VARCHAR(100),
    bairro VARCHAR(100),
    estado VARCHAR(100)
);

CREATE TABLE arquivo (
    cd_arquivo SERIAL PRIMARY KEY,
    nm_arquivo VARCHAR(100),
    tp_arquivo SMALLINT,
    dt_arquivo TIMESTAMP WITHOUT TIME ZONE
);

CREATE TABLE pessoa (
    cd_pessoa SERIAL PRIMARY KEY,
    nm_pessoa VARCHAR(255) NOT NULL,
    nr_telefone_1 VARCHAR(20),
    nr_telefone_2 VARCHAR(20),
    cd_endereco INTEGER NOT NULL,
    cd_arquivo INTEGER NOT NULL,
    tp_pessoa SMALLINT,
    CONSTRAINT fk_cd_endereco FOREIGN KEY (cd_endereco) REFERENCES endereco(cd_endereco),
    CONSTRAINT fk_cd_arquivo FOREIGN KEY (cd_arquivo) REFERENCES arquivo(cd_arquivo)
);

CREATE TABLE web_user (
    cd_web_user SERIAL PRIMARY KEY,
    cd_pessoa INTEGER NOT NULL,
    nm_login VARCHAR(255),
    password VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    CONSTRAINT fk_cd_pessoa FOREIGN KEY (cd_pessoa) REFERENCES pessoa(cd_pessoa)
);


