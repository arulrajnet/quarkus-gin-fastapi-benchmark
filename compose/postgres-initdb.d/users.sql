CREATE TABLE IF NOT EXISTS users (
    id bigserial PRIMARY KEY,
    firstName character varying(50) NOT NULL,
    lastName character varying(50) NOT NULL,
    createdAt timestamp with time zone NOT NULL DEFAULT now()
);

-- Insert 100 rows into the users table
DO $$
BEGIN
    FOR i IN 1..100 LOOP
        INSERT INTO users (firstName, lastName)
        VALUES (md5(random()::text), md5(random()::text));
    END LOOP;
END $$;
