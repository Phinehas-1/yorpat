INSERT INTO admin_users (id, email, password, name, loggedIn) VALUES
  (UNHEX(REPLACE('11111111-1111-1111-1111-111111111111','-','')), 'admin1@example.com', 'password1', 'Admin One', false),
  (UNHEX(REPLACE('22222222-2222-2222-2222-222222222222','-','')), 'admin2@example.com', 'password2', 'Admin Two', false),
  (UNHEX(REPLACE('33333333-3333-3333-3333-333333333333','-','')), 'admin3@example.com', 'password3', 'Admin Three', false);
