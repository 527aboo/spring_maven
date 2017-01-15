DROP TABLE IF EXISTS meeting_room CASCADE /;

CREATE TABLE IF NOT EXISTS meeting_room (
  room_id SERIAL NOT NULL,
  room_name VARCHAR(255) NOT NULL,
  PRIMARY KEY (room_id)
)/;


INSERT INTO meeting_room (room_name) VALUES ('新木場')/;
INSERT INTO meeting_room (room_name) VALUES ('辰巳')/;
INSERT INTO meeting_room (room_name) VALUES ('豊洲')/;
INSERT INTO meeting_room (room_name) VALUES ('月島')/;
INSERT INTO meeting_room (room_name) VALUES ('新富町')/;
INSERT INTO meeting_room (room_name) VALUES ('銀座一丁目')/;
INSERT INTO meeting_room (room_name) VALUES ('有楽町')/;
