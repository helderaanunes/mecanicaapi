DELETE FROM lancamento;

INSERT INTO lancamento (descricao, valor, data_hora, tipo) VALUES
('Serviço de Freio', 450.00, DATE_SUB(NOW(), INTERVAL 6 DAY), 'ENTRADA'),
('Compra de Peças', 200.00, DATE_SUB(NOW(), INTERVAL 6 DAY), 'SAIDA'),

('Troca de Óleo', 180.00, DATE_SUB(NOW(), INTERVAL 5 DAY), 'ENTRADA'),

('Alinhamento', 120.00, DATE_SUB(NOW(), INTERVAL 4 DAY), 'ENTRADA'),
('Energia Elétrica', 350.00, DATE_SUB(NOW(), INTERVAL 4 DAY), 'SAIDA'),

('Conserto Suspensão', 850.00, DATE_SUB(NOW(), INTERVAL 3 DAY), 'ENTRADA'),

('Revisão Geral', 1200.00, DATE_SUB(NOW(), INTERVAL 2 DAY), 'ENTRADA'),
('Pagamento Fornecedor', 600.00, DATE_SUB(NOW(), INTERVAL 2 DAY), 'SAIDA'),

('Troca de Pneus', 900.00, DATE_SUB(NOW(), INTERVAL 1 DAY), 'ENTRADA'),

('Serviço Motor', 1500.00, NOW(), 'ENTRADA'),
('Aluguel Oficina', 1000.00, NOW(), 'SAIDA');