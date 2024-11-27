
INSERT INTO T_AUTHORITY (id,rank, description) VALUES
('A','ADMIN', 'Administrator Level'),
('B', 'POWER_USER','Moderator Level'),
('C', 'NORMAL','User Level');
INSERT INTO T_USER (email, password, authority_id) VALUES
('admin@example.com', '$2a$10$UgyTyEN6XuwXoHM60xGP4eC3tv6yBJzhVnMtDvhjwBy1hbpESQoKS', 'A'), -- Aランク
('moderator@example.com', '$2a$10$yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy', 'B'), -- Bランク
('user@example.com', '$2a$10$zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz', 'C'); -- Cランク
INSERT INTO T_MEETING (title, detail, opener_id, delete_flg) VALUES
('Project Kickoff', 'Initial project discussion', 1, '0'),
('Weekly Sync', 'Weekly team sync-up', 2, '0'),
('Budget Review', 'Review budget allocations', 3, '0'),
('Retrospective', 'Sprint retrospective meeting', 1, '1');