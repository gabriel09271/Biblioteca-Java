
-- Inserindo 4 itens

INSERT INTO item (codigo, titulo, tipo, autor, edicao, disponivel)
VALUES
    ('L001', 'O Hobbit', 'Livro', 'J.R.R. TOLKIEN', 1, FALSE),
    ('L002', 'O Senhor dos Anéis: A Sociedade do Anel', 'Livro', 'J.R.R. TOLKIEN', 2, FALSE),
    ('L003', '1984', 'Livro', 'GEORGE ORWELL', 10, TRUE),
    ('R001', 'Ciência Hoje', 'Revista', 'CIENTISTA MARCELO FILHO', NULL, TRUE),
    ('R002', 'Homem Aranha: O vigilante de Nova York', 'Revista', 'O CLARIM DIÁRIO', 1, FALSE);

-- Inserindo 2 usuários

INSERT INTO usuario (nome, tipo, limite_itens)
VALUES
    ('Gabriel', 'ALUNO', 3),
    ('Jefferson', 'PROFESSOR', 5);

-- Inserindo 3 empréstimos

INSERT INTO emprestimo 
	(item_id, usuario_id, data_retirada, data_devolucao_prevista, data_devolucao, valor_multa)
VALUES 
	(21, 5, '2026-10-01', '2026-10-14', '2026-10-13', 0.00),
	(22, 5, '2026-10-10', '2026-10-24', NULL, 2.50),
	(25, 6, '2026-10-05', '2026-10-12', '2026-10-12', 0.00);