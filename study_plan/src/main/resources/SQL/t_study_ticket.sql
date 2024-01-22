CREATE TABLE t_study_tickets ( 
	u_ticket_id SERIAL PRIMARY KEY,
	u_title  varchar(30),
	u_content varchar(100),
	u_created_date date,
	u_complete_limit_date date,
	u_complete_date date,
	u_delete_flag boolean,
	u_status smallint,
	u_category smallint );