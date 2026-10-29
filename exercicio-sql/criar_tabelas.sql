-- EXERCÍCIO 2 — Modelagem do Banco de Dados

-- Tabela de itens
CREATE TABLE item (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    codigo VARCHAR(20) NOT NULL UNIQUE,
    titulo VARCHAR(100) NOT NULL,
    tipo VARCHAR(20) NOT NULL
        CHECK (tipo IN ('Livro', 'Revista')),
    autor VARCHAR(100) NOT NULL,
    edicao INTEGER,
    disponivel BOOLEAN NOT NULL DEFAULT TRUE
);

-- Tabela de usuários
CREATE TABLE usuario (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    tipo VARCHAR(20) NOT NULL
        CHECK (tipo IN ('ALUNO', 'PROFESSOR')),
    limite_itens INTEGER NOT NULL CHECK (limite_itens >= 0)
);

-- Tabela de empréstimos
CREATE TABLE emprestimo (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    item_id INTEGER NOT NULL REFERENCES item(id),
    usuario_id INTEGER NOT NULL REFERENCES usuario(id),
    data_retirada DATE NOT NULL,
    data_devolucao_prevista DATE NOT NULL,
    data_devolucao DATE,
    valor_multa NUMERIC(10, 2) NOT NULL DEFAULT 0
        CHECK (valor_multa >= 0)
);