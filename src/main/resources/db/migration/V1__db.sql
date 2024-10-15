CREATE TABLE pessoa (
  cd_pessoa SERIAL PRIMARY KEY,
  nm_pessoa VARCHAR(255) NOT NULL,
  nr_telefone_1 VARCHAR,
  nr_telefone_2 VARCHAR,
  cd_endereco INTEGER NOT NULL,
  cd_arquivo INTEGER NOT NULL,
  tp_pessoa SMALLINT
)
