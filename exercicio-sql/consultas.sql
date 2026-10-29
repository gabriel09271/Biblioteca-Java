-- EXERCÍCIO 3 — Consultas SQL

-- 1. listar todo o acervo, com código, título, tipo e disponibilidade.

        SELECT
            codigo,
            titulo,
            tipo,
            disponivel AS disponibilidade
        FROM item;

-- 2. listar os empréstimos em aberto, com o nome do usuário e o título do item.

        SELECT
            u.nome AS usuario,
            i.titulo AS item,
            e.data_devolucao
        FROM emprestimo e
        INNER JOIN usuario u ON e.usuario_id = u.id
        INNER JOIN item i ON e.item_id = i.id
        WHERE e.data_devolucao IS NULL;

-- 3. calcular o total de multas acumuladas por usuário.

        SELECT
            u.nome AS usuario,
            COALESCE(SUM(e.valor_multa), 0) AS total_multas
        FROM usuario u
        LEFT JOIN emprestimo e ON u.id = e.usuario_id
        GROUP BY u.id, u.nome
        ORDER BY u.nome;

-- 4. listar os itens que nunca foram emprestados.

        SELECT
	        i.titulo AS item,
            i.codigo,
	        i.tipo,
	        i.disponivel AS disponibilidade
        FROM item i
        LEFT JOIN emprestimo e ON i.id = e.item_id
        WHERE e.item_id IS NULL;