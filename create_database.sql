DROP DATABASE IF EXISTS travel_agency;
CREATE DATABASE IF NOT EXISTS travel_agency;
USE travel_agency;

CREATE TABLE branch(
br_code INT NOT NULL AUTO_INCREMENT,
br_street VARCHAR(30) NOT NULL,
br_num CHAR(10) NOT NULL,
br_city VARCHAR(30),

PRIMARY KEY (br_code)
);



CREATE TABLE worker(
wrk_AT CHAR(10) UNIQUE NOT NULL,
wrk_name VARCHAR(20) NOT NULL,
wrk_lname VARCHAR(20) NOT NULL,
wrk_salary FLOAT NOT NULL,
wrk_br_code INT NOT NULL,

PRIMARY KEY (wrk_AT),
CONSTRAINT WRKBR FOREIGN KEY (wrk_br_code) REFERENCES branch(br_code)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE it(
it_AT CHAR(10) UNIQUE NOT NULL,
it_pswb CHAR(10) DEFAULT "password",
it_start_date DATE,
it_end_date DATE,
 
 primary key(it_AT),
 CONSTRAINT ITWRK FOREIGN KEY (it_AT) REFERENCES worker(wrk_AT)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE driver(
drv_AT CHAR(10) UNIQUE NOT NULL,
drv_license ENUM("A", "B", "C", "D"),
drv_route ENUM("LOCAL", "ABROAD"),
drv_experience TINYINT NOT NULL,

PRIMARY KEY (drv_AT),
CONSTRAINT DRWRK FOREIGN KEY (drv_AT) REFERENCES worker(wrk_AT)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE guide(
gui_AT CHAR(10) UNIQUE NOT NULL,
gui_cv TEXT NOT NULL,

PRIMARY KEY (gui_AT),
CONSTRAINT GUWRK FOREIGN KEY (gui_AT) REFERENCES worker(wrk_AT)
ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE admin(
adm_AT CHAR(10) UNIQUE NOT NULL,
adm_type ENUM("LOGISTICS", "ADMINISTRATIVE", "ACCOUNTING"),
adm_diploma VARCHAR(200) NOT NULL,

PRIMARY KEY (adm_AT),
CONSTRAINT ADMWRK FOREIGN KEY (adm_AT) REFERENCES worker(wrk_AT)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE manages(
mng_adm_AT CHAR(10) UNIQUE NOT NULL,
mng_br_code INT NOT NULL,

PRIMARY KEY (mng_adm_AT, mng_br_code),
CONSTRAINT MNGWRK FOREIGN KEY (mng_adm_AT) REFERENCES admin(adm_AT)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT MNGBR FOREIGN KEY (mng_br_code) REFERENCES branch(br_code)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE trip (
    tr_id INT NOT NULL UNIQUE AUTO_INCREMENT,
    tr_departure DATETIME NOT NULL,
    tr_return DATETIME NOT NULL,
    tr_maxseats TINYINT NOT NULL,
    tr_cost FLOAT NOT NULL,
    tr_br_code INT NOT NULL,
    tr_gui_AT CHAR(10) DEFAULT "unknown",
    tr_drv_AT CHAR(10) DEFAULT "unknown",
    PRIMARY KEY (tr_id),
   
    CONSTRAINT TRBR FOREIGN KEY (tr_br_code) REFERENCES branch(br_code)
	ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT TRDR FOREIGN KEY (tr_drv_AT) REFERENCES driver(drv_AT)
    ON DELETE SET NULL ON UPDATE CASCADE,
    CONSTRAINT TRGU FOREIGN KEY (tr_gui_AT) REFERENCES guide(gui_AT)
    ON DELETE SET NULL ON UPDATE CASCADE
);


CREATE TABLE event (
    ev_tr_id INT NOT NULL AUTO_INCREMENT,
    ev_start DATETIME NOT NULL,
    ev_end DATETIME NOT NULL,
    ev_descr TEXT NOT NULL,
    PRIMARY KEY (ev_tr_id , ev_start),
    CONSTRAINT EVTR FOREIGN KEY (ev_tr_id) REFERENCES trip (tr_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE phones(
ph_br_code INT NOT NULL,
ph_number CHAR(10) NOT NULL,

PRIMARY KEY (ph_br_code, ph_number),
CONSTRAINT PHBR FOREIGN KEY (ph_br_code) REFERENCES branch(br_code)
ON DELETE CASCADE ON UPDATE CASCADE

);

CREATE TABLE languages (
lng_gui_AT CHAR(10) NOT NULL,
lng_language VARCHAR(30) NOT NULL,

PRIMARY KEY (lng_gui_AT, lng_language),
CONSTRAINT LNGUI FOREIGN KEY (lng_gui_AT) REFERENCES guide(gui_AT)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE destination(
dst_id INT UNIQUE NOT NULL AUTO_INCREMENT,
dst_name VARCHAR(50) NOT NULL,
dst_descr TEXT NOT NULL,
dst_rtype ENUM("LOCAL", "ABROAD"),
dst_language VARCHAR(30) NOT NULL,
dst_location VARCHAR(25),

PRIMARY KEY (dst_id)
);


CREATE TABLE travel_to(
to_tr_id INT UNIQUE NOT NULL,
to_dst_id INT NOT NULL,
to_arrival DATETIME NOT NULL,
to_departure DATETIME NOT NULL,

PRIMARY KEY (to_tr_id, to_dst_id),
CONSTRAINT TOTR FOREIGN KEY (to_tr_id) REFERENCES trip(tr_id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT TODST FOREIGN KEY (to_dst_id) REFERENCES destination(dst_id)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE reservation(
res_tr_id INT UNIQUE NOT NULL AUTO_INCREMENT,
res_seatnum TINYINT NOT NULL,
res_name VARCHAR(20) NOT NULL,
res_lname VARCHAR(20) NOT NULL,
res_isadult ENUM("ADULT", "MINOR"),

PRIMARY KEY (res_tr_id, res_seatnum),
CONSTRAINT RESTR FOREIGN KEY (res_tr_id) REFERENCES trip(tr_id)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE offers(
of_id INT UNIQUE NOT NULL AUTO_INCREMENT,
of_start DATE NOT NULL,
of_end DATE NOT NULL,
of_costpp INT NOT NULL,
of_dst_id INT NOT NULL,

primary key(of_id),
CONSTRAINT OFDST FOREIGN KEY (of_dst_id) REFERENCES destination(dst_id)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE reservation_offers(
resof_id INT UNIQUE NOT NULL AUTO_INCREMENT,
resof_name CHAR(30) NOT NULL DEFAULT "unknown",
resof_lname CHAR(30) NOT NULL DEFAULT "unknown",
resof_of_id INT NOT NULL,
resof_paid INT NOT NULL,

primary key(resof_id),
CONSTRAINT RESOFOF FOREIGN KEY (resof_of_id) REFERENCES offers(of_id)
ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE log(
log_id INT UNIQUE NOT NULL AUTO_INCREMENT,
log_user_AT CHAR(20) NOT NULL,
log_action CHAR(20),
log_table CHAR(20),

primary key(log_id)
);

INSERT INTO branch VALUES
(1, 'Themistokleoys', 56, 'Thessaloniki'),
(NULL, 'Kyklopon', 32, 'Athina'),
(NULL, 'Timonos', 164, 'Athina'),
(NULL, 'Pallinaion', 5, 'Sparti'),
(NULL, 'Afidnaion', 66, 'Volos'),
(NULL, 'Rodopis', 71, 'Thessaloniki'),
(NULL, 'Grevenon', 24, 'Athina'),
(NULL, 'Fokou', 80, 'Volos'),
(NULL, 'Persefonis', 100, 'Thessaloniki'),
(NULL, 'Agisilaou', 2, 'Athina'),
(NULL, "Rizospastwn", 35, "Argostoli"),
(NULL, "Bergwth", 43, "Athens"),
(NULL, "Momferatou", 8, "Thessaloniki"),
(NULL, "Aetoraxis", 77, "Larisa"),
(NULL, "Byronws", 53, "Arta"),
(NULL, "Skoufa", 43, "Kerkyra"),
(NULL, "Pyrrou", 17, "Hrakleio"),
(NULL, "Antwnh Tritsh", 82, "Tripoli"),
(NULL, "Sitemporwn", 24, "Florina"),
(NULL, "Devosetou", 47, "Skiathos");

INSERT INTO worker VALUES
('ATK1315846', 'Petros', 'Kazatzis', 1000.00, 1),
('ATK4836520', 'Giorgos', 'Kalamis', 1500.50, 2),
('AMN0046398', 'Katerina', 'Vasilioy', 2000.00, 3),
('ATK8477656', 'Kostas', 'Papoytsis', 1300.00, 4),
('AMN3526783', 'Maria', 'Peponi', 1200.30, 5),
('BGK8462000', 'Spyros', 'Karboyniaris', 1700.00, 6),
('AMN7429291', 'Sokratis', 'Voyrdas', 2000.50, 7),
('BGK8881231', 'Stelios', 'Papapetroy', 1000.00, 8),
('ATK7776639', 'Konstantina', 'Karpatsioy', 1200.00, 9),
('BGK3727188', 'Perseas', 'Kallikraths', 2200.00, 10),
('ATK4638999', 'Patroklos', 'Kostopoylos', 900.00, 1),
('AMN1119994', 'Leonidas', 'Nikolaidis', 1100.00, 2),
('AMN3647589', 'Persofoni', 'Antipa', 1350.40, 3),
('BGK0001921', 'Pelopidas', 'Ologios', 1550.00, 4),
('BGK4322253', 'Ermionh', 'Feroypi', 1600.00, 5),
('AMN3909461', 'Periklis', 'Tertaros', 1300.00, 6),
('BGK3343351', 'Georgia', 'Xenioy', 1380.00, 7),
('ATK9354465', 'Sotiria', 'Deligioy', 1100.00, 8),
('ATK5243784', 'Mixalis', 'Alvakis', 990.00, 9),
('BGK6458247', 'Elpida', 'Ferosoy', 1050.00, 10),
('AMN5182954', 'Giorgos', 'Violis', 1230.00, 1),
('BGK2743822', 'Maria', 'Troykoy', 980.00, 2),
('ATK7842587', 'Giota', 'Sparoy', 1000.00, 3),
('BGK1313478', 'Petros', 'Mixoy', 890.00, 4),
('BGK4782387', 'Kostas', 'Kostidis', 980.00, 5),
('ATK4388828', 'Achilleas', 'Terteris', 980.00, 6),
('BGK7473628', 'Ektoras', 'Lastos', 1240.50, 7),
('AMN9090999', 'Dimitra', 'Zenisi', 1000.00, 8),
('BGK7483990', 'Athina', 'Eromaxi', 960.00, 9),
('ATK7788877', 'Aris', 'Spathostratos', 1450.00, 10),
("AT435342", "Michael", "Scott", 3500, 12),
("AT647865", "Jim", "Halpert", 2100, 13),
("AT432356", "Dwight", "Schrute", 2100, 15),
("AT546785", "Pam", "Beesly", 1500, 13),
("AT647392", "Andy", "Bernard", 2200, 14),
("AT930291", "Stanley", "Hudson", 1900, 17),
("AT849382", "Phyllis", "Vance", 2050, 18),
("AT253647", "Angela", "Martin", 2200, 19),
("AT125321", "Oscar", "Martinez", 2200, 16),
("AT986695", "Kevin", "Malone", 1700, 11),
("AT541121", "David", "Wallas", 4000, 11),
("AT994032", "Meredith", "Palmer", 1900, 12),
("AT554332", "Creed", "Bratton", 1650, 14),
("AT885736", "Ryan", "Howard", 1500, 15),
("AT657483", "Robert", "California", 2600, 11),
("AT439233", "Kelly", "Kapoor", 2000, 12),
("AT453890", "Toby", "Flenderson", 2300, 13),
("AT899878", "Darryl", "Phibbin", 1800, 14),
("AT675038", "Roy", "Anderson", 1800, 15),
("AT533234", "Erin", "Hannon", 1750, 16),
("AT903827", "Gabe", "Lewis", 2300, 17),
("AT758483", "Clark", "Green", 2100, 18),
("AT234955", "Pete", "Miller", 2250, 19),
("AT857362", "Jo", "Bennett", 4000, 20),
("AT749920", "Rachel", "Green", 2100, 20),
("AT434253", "Monica", "Geller", 2200, 20),
("AT909583", "Phoebe", "Buffay", 1900, 16),
("AT640901", "Joey", "Tribbiani", 2000, 17),
("AT125432", "Chandler", "Bing", 2400, 14),
("AT789504", "Ross", "Geller", 1750, 12),
("ATK94738", "Vasiliki", "Giotoy", 1500, 1),
("AT123456", "Vilma", "Sagki", 1500, 1);

INSERT INTO driver VALUES
('ATK4388828', 'A', 'ABROAD', 5),
('BGK7473628', 'C', 'LOCAL', 10),
('AMN9090999', 'A', 'LOCAL', 3),
('BGK7483990', 'B', 'LOCAL', 9),
('ATK7788877', 'D', 'ABROAD', 15),
('AMN5182954', 'B', 'LOCAL', 5),
('BGK2743822', 'D', 'ABROAD', 13),
('ATK7842587', 'A', 'ABROAD', 20),
('BGK1313478', 'B', 'ABROAD', 17),
('BGK4782387', 'C', 'LOCAL', 1),
("AT435342", "A", "LOCAL", 5),
("AT647865", "B", "ABROAD", 8),
("AT432356", "C", "LOCAL", 2),
("AT546785", "D", "ABROAD", 6),
("AT647392", "A", "ABROAD", 7),
("AT930291", "B", "LOCAL", 3),
("AT849382", "C", "ABROAD", 1),
("AT253647", "D", "LOCAL", 4),
("AT125321", "A", "LOCAL", 9),
("AT986695", "B", "ABROAD", 5);

INSERT INTO admin VALUES
('ATK1315846', 'LOGISTICS', 'logistics'),
('ATK4836520', 'ADMINISTRATIVE', 'management'),
('AMN0046398', 'ACCOUNTING', 'economic'),
('ATK8477656', 'ACCOUNTING', 'economic'),
('AMN3526783', 'LOGISTICS', 'logistics'),
('BGK8462000', 'LOGISTICS', 'logistics'),
('AMN7429291', 'ADMINISTRATIVE', 'management'),
('BGK8881231', 'LOGISTICS', 'logistics'),
('ATK7776639', 'ACCOUNTING', 'economic'),
('BGK3727188', 'LOGISTICS', 'logistics'),
("AT903827", "ADMINISTRATIVE", "Master in International Trade Relations"),
("AT758483", "ADMINISTRATIVE", "Master in Climate Change, Development and POlicy"),
("AT234955", "ADMINISTRATIVE", "Master in Diplomacy and International Organizations"),
("AT857362", "LOGISTICS", "Master in International Supply Chain Management and Logistics"),
("AT749920", "LOGISTICS", "PhD in Bussiness Economics"),
("AT434253", "LOGISTICS", "PhD in Economics"),
("AT909583", "LOGISTICS", "Master in Applied Mathematics"),
("AT640901", "ACCOUNTING", "Master in Finance, Accounting and Taxation"),
("AT125432", "ACCOUNTING", "Master in Accounting and Bussiness Information Technology"),
("AT789504", "ACCOUNTING", "Master in Forensic Accounting"),
("AT123456", "ADMINISTRATIVE", "Master in Bussiness");

INSERT INTO manages VALUES
('ATK1315846', 1),
('ATK4836520', 2),
('AMN0046398', 3),
('ATK8477656', 4),
('AMN3526783', 5),
('BGK8462000', 6),
('AMN7429291', 7),
('BGK8881231', 8),
('ATK7776639', 9),
('BGK3727188', 10),
("AT903827", 11),
("AT758483", 12),
("AT234955", 13),
("AT857362", 14),
("AT749920", 15),
("AT434253", 16),
("AT909583", 17),
("AT640901", 18),
("AT125432", 19),
("AT789504", 20);

INSERT INTO phones VALUES
(1, '6984637882'),
(2, '6983662711'),
(3, '8974466020'),
(4, '6980023131'),
(5, '6973232000'),
(6, '6981212343'),
(7, '6975489377'),
(8, '6937584990'),
(9, '6973918273'),
(10, '6938847726'),
(11, "2671025225"),
(12, "2071093847"),
(13, "3471098732"),
(14, "5471083982"),
(15, "3271083943"),
(16, "9847382746"),
(17, "8738293884"),
(18, "7637266372"),
(19, "4885935704"),
(20, "7839283746");

INSERT INTO guide VALUES
('ATK4638999', 'Istorikos'),
('AMN1119994', 'Archaiologos'),
('AMN3647589', 'Istorikos'),
('BGK0001921', 'Istorikos'),
('BGK4322253', 'Archaiologos'),
('AMN3909461', 'Theologos'),
('BGK3343351', 'Moysikos'),
('ATK9354465', 'Theologos'),
('ATK5243784', 'Archaiologos'),
('BGK6458247', 'Istorikos'),
("AT541121", "Master in History of Ancient Civilations"),
("AT994032", "Master in Archaeology"),
("AT554332", "Phd in Paleontology"),
("AT885736", "Master in Mediterranean Archaeology"),
("AT657483", "Philosopher"),
("AT439233", "Diploma in Human Osteoarchaeology"),
("AT453890", "Diploma in European Archaeology"),
("AT899878", "Phd in Historical Culture and Medieval Worlds"),
("AT675038", "Diploma in Advanced Paleontology"),
("AT533234", "Master of Arts in Humanities");

INSERT INTO languages VALUES
('ATK4638999', 'Agglika'),
('AMN1119994', 'Ispanika'),
('AMN3647589', 'Mandarinika'),
('BGK0001921', 'Germanika'),
('BGK4322253', 'Italika'),
("AT541121", "English, Greek, Spanish"),
("AT994032", "Greek, Arabic, Italian, German"),
("AT554332", "Danish, English, French"),
("AT885736", "French, Polish, Norwegian"),
("AT657483", "English,  Chinese, Hindi"),
("AT439233", "French, Portuguese, Spanish"),
("AT453890", "German, Portuguese, Greek"),
("AT899878", "Japanese, Dutch, Czech"),
("AT675038", "Greek, Italian, French"),
("AT533234", "German, English, Greek");

INSERT INTO trip VALUES
(1, "2022-09-03 17:30:00", "2022-09-09 18:00:00", 100, 750.00, 1, 'ATK4638999', 'AMN5182954'),
(2, "2022-07-10 08:00:00", "2022-07-15 08:00:00", 120, 1000.00, 2, 'AMN1119994', 'BGK2743822'),
(3, "2022-11-15 09:00:00", "2022-11-17 15:00:00", 75, 360.00, 3, 'AMN3647589', 'ATK7842587'),
(4, "2022-09-01 06:00:00", "2022-09-08 18:00:00", 100, 1200.00, 4, 'BGK0001921', 'BGK1313478'),
(5, "2022-02-02 11:00:00", "2022-02-05 05:00:00", 50, 950.00, 5, 'BGK4322253', 'BGK4782387'),
(6, "2022-01-13 13:00:00", "2022-01-19 13:00:00", 100, 880.00, 6, 'AMN3909461', 'ATK4388828'),
(7, "2023-05-22 04:00:00", "2023-05-27 04:00:00", 60, 1350.00, 7, 'BGK3343351', 'BGK7473628'),
(8, "2023-02-10 14:00:00", "2023-03-01 17:00:00", 90, 2200.00, 8, 'ATK9354465', 'AMN9090999'),
(9, "2023-08-11 19:00:00", "2023-08-13 09:00:00", 35, 1100.00, 9, 'ATK5243784', 'BGK7483990'),
(10, "2023-11-11 07:00:00", "2023-11-18 10:00:00", 90, 890.00, 10, 'BGK6458247', 'ATK7788877'),
(11, "2023-02-03 9:00:00", "2023-02-09 19:00:00", 1, 750.00, 11, "AT541121", "AT435342"),
(12, "2023-03-07 9:00:00", "2023-03-11 20:00:00", 120, 500.00, 12, "AT994032", "AT647865"),
(13, "2023-04-02 9:00:00", "2023-04-08 11:00:00", 75, 600.00, 13, "AT554332", "AT432356"),
(14, "2023-05-01 9:00:00", "2023-05-06 16:00:00", 90, 550.00, 14, "AT885736", "AT546785"),
(15, "2023-06-08 9:00:00", "2023-06-13 13:00:00", 120, 650.00, 15, "AT657483", "AT647392"),
(16, "2023-07-09 9:00:00", "2023-07-16 05:00:00", 90, 820.00, 16, "AT439233", "AT930291"),
(17, "2023-08-10 9:00:00", "2023-08-19 15:00:00", 110, 1000.00, 17, "AT453890", "AT849382"),
(18, "2023-09-12 9:00:00", "2023-09-20 08:00:00", 80, 950.00, 18, "AT899878", "AT253647"),
(19, "2023-11-17 9:00:00", "2023-11-23 20:00:00", 100, 470.00, 19, "AT675038", "AT125321"),
(20, "2023-12-20 9:00:00", "2023-12-30 03:00:00", 120, 1500.00, 20, "AT533234", "AT986695"),
(21, "2022-01-13 13:00:00", "2022-01-19 13:00:00", 100, 880.00, 6, 'AMN3909461', 'ATK4388828');

INSERT INTO event VALUES
(1, "2022-09-04 12:00:00", "2022-09-04 14:00:00", "Pop Party"),
(2, "2022-07-12 17:00:00", "2022-07-12 23:00:00", "Rave Party"),
(3, "2022-11-15 19:00:00", "2022-11-15 22:00:00", "Concert Adele"),
(4, "2022-09-02 10:00:00", "2022-09-02 12:00:00", "Formula"),
(5, "2022-02-02 15:00:00", "2022-02-02 19:00:00", "Chess Tournament"),
(6, "2022-01-14 09:00:00", "2022-01-14 13:00:00", "Bird Watching"),
(7, "2023-05-22 19:00:00", "2023-05-22 23:00:00", "TommorowLand"),
(8, "2023-02-15 12:00:00", "2023-02-25 12:00:00", "NFS Championship"),
(9, "2023-08-12 16:00:00", "2023-08-12 18:00:00", "Fast Food Tournamnet"),
(10, "2023-11-13 08:00:00", "2023-11-13 11:00:00", "Church"),
(11, "2023-02-05 9:00:00", "2023-02-10 23:00:00", "Super Bowl"),
(12, "2023-03-07 9:00:00", "2023-03-08 9:00:00", "75th Writers Guild of America Award"),
(14, "2023-05-01 20:00:00", "2023-05-02 3:00:00",  "Lyrids Meteor Shower"),
(15, "2023-06-08 9:00:00", "2023-06-08 9:00:00", "Penumbral Lunar Eclipse "),
(16, "2023-07-09 9:00:00", "2023-07-09 9:00:00", "Supermoon"),
(17, "2023-08-10 22:00:00", "2023-08-11 3:00:00", "Blue Moon"),
(18, "2023-09-17 9:00:00", "2023-09-17 23:00:00", "Gran Prix Signapore"),
(19, "2023-11-17 9:00:00", "2023-11-17 19:00:00", "Melbourne Cup Horse Racing"),
(20, "2023-12-25 00:00:00", "2023-12-20 23:59:59", "Christmas");

INSERT INTO reservation VALUES
(1, 30, 'Dimitris', 'Peronis', 'ADULT'),
(2, 24, 'Pelopidas', 'Maximos', 'ADULT'),
(3, 31, 'Pavlos', 'Kratimenos', 'MINOR'),
(4, 27, 'Giorgia', 'Dekakoy', 'ADULT'),
(5, 39, 'Xristos', 'Koyrkoytis', 'MINOR'),
(6, 10, 'Sotiris', 'Gkekos', 'ADULT'),
(7, 4, 'Zina', 'Ziakoy', 'MINOR'),
(8, 34, 'Savvas', 'Loygkos', 'ADULT'),
(9, 20, 'Loykas', 'Arsipis', 'ADULT'),
(10, 58, 'Nikos', 'Sxisos', 'MINOR'),
(11, 1, "Holly", "Flax", "ADULT"),
(12, 1, "Kaitlyn", "Cole", "MINOR"),
(13, 6, "Agnes", "Knowles", "ADULT"),
(14, 3, "Autumn", "Murphy", "MINOR"),
(15, 7, "Isabel", "Todd", "ADULT"),
(16, 5, "Dominic", "Wallace", "MINOR"),
(17, 6, "Sonny", "Weaver", "ADULT"),
(18, 8, "Joe", "Gentry", "MINOR"),
(19, 2, "Ajay", "Benson", "ADULT"),
(20, 5, "Mathew", "Briggs", "MINOR");

INSERT INTO destination VALUES
(1, 'Paris', 'Beautiful', 'ABROAD', 'French', 'France'),
(2, 'Berlin', 'Majestic', 'ABROAD', 'German', 'Germany'),
(3, 'Stockholm', 'Lovely people', 'ABROAD', 'Swedish', 'Sweden'),
(4, 'Zagreb', 'Simple Life', 'ABROAD', 'Croatian', 'Croatia'),
(5, 'Mykonos', 'Gorgeous', 'LOCAL', 'Greek', 'Greece'),
(6, 'Santorini', 'Gorgeous', 'LOCAL', 'Greek', 'Greece'),
(7, 'Chios', 'Gorgeous', 'LOCAL', 'Greek', 'Greece'),
(8, 'Metsovo', 'Gorgeous', 'LOCAL', 'Greek', 'Greece'),
(9, 'Dublin', 'Whiskey', 'ABROAD', 'Irish', 'Ireland'),
(10, 'Dimitsana', 'Gorgeous', 'LOCAL', 'Greek', 'Greece'),
(11, "Hanover", "Beer", "ABROAD", "German", 'Germany'),
(12, "Frankfurt", "Croissant", "ABROAD", "French", 'France'),
(13, "Milan", "Passion", "ABROAD", "Italian", 'Italy'),
(14, "Kefalonia", "Beauty", "LOCAL", "Greek", 'Greece'),
(15, "Riyadh", "Rich", "ABROAD", "Arabic", 'Saudi Arabia'),
(16, "Osaka-shi", "Traditional", "ABROAD", "Japanese", 'Japan'),
(17, "Aarhus", "Architecture", "ABROAD", "Danish", 'Denmark'),
(18, "Krakow", "Auschwitz", "ABROAD", "Polish", 'Poland'),
(19, "Cambridge", "Rain", "ABROAD", "English", 'England'),
(20, "Seville", "Football", "ABROAD", "Spanish", 'Spain');


INSERT INTO destination VALUES (21, 'Kerkyra', 'Gorgeous', 'LOCAL', 'Greek', 'Greece');

INSERT INTO travel_to VALUES
(1, 1, "2022-09-03 16:30:00", "2022-09-09 15:00:00"),
(2, 2, "2022-07-12 17:00:00", "2022-07-12 22:00:00"),
(3, 3, "2022-11-15 11:00:00", "2022-11-17 13:00:00"),
(4, 4, "2022-09-01 09:00:00", "2022-09-08 20:00:00"),
(5, 5, "2022-02-02 12:00:00", "2022-02-05 03:00:00"),
(6, 6, "2022-01-14 14:00:00", "2022-01-14 08:00:00"),
(7, 7, "2023-05-22 18:00:00", "2023-05-22 22:00:00"),
(8, 8, "2023-02-15 14:00:00", "2023-02-25 10:00:00"),
(9, 9, "2023-08-12 19:00:00", "2023-08-12 14:00:00"),
(10, 10, "2023-11-13 10:00:00", "2023-11-13 09:00:00"),
(11, 11, "2023-02-03 10:00:00", "2023-02-09 16:00:00"),
(12, 12, "2023-03-07 14:00:00", "2023-03-11 19:00:00"),
(13, 13, "2023-04-02 15:00:00", "2023-04-08 10:00:00"),
(14, 14, "2023-05-01 16:00:00", "2023-05-06 12:00:00"),
(15, 15, "2023-06-08 10:00:00", "2023-06-13 10:00:00"),
(16, 16, "2023-07-09 12:00:00", "2023-07-16 02:00:00"),
(17, 17, "2023-08-10 10:00:00", "2023-08-19 13:00:00"),
(18, 18, "2023-09-12 13:00:00", "2023-09-20 06:00:00"),
(19, 19, "2023-11-17 17:00:00", "2023-11-23 18:00:00"),
(20, 20, "2023-12-20 15:00:00", "2023-12-30 02:00:00");

INSERT INTO it VALUES
("ATK94738", "hello", "2022-05-23", "2023-01-10");

INSERT INTO offers VALUES 
(1, "2023-05-01", "2025-05-01", 500, 5);

SET GLOBAL local_infile = 'ON';
LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\names.csv' INTO TABLE reservation_offers
	FIELDS TERMINATED BY '\t'
	LINES TERMINATED BY '\n'
    (resof_name, resof_lname, @dummy, @dummy)
    SET resof_of_id = 1, 
    resof_paid = 250 + (500 - 250) * RAND();
    
LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\names.csv' INTO TABLE reservation_offers
	FIELDS TERMINATED BY '\t'
	LINES TERMINATED BY '\n'
    (resof_name, resof_lname, @dummy, @dummy)
    SET resof_of_id = 1, 
    resof_paid = 250 + (500 - 250) * RAND();
    
LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\names.csv' INTO TABLE reservation_offers
	FIELDS TERMINATED BY '\t'
	LINES TERMINATED BY '\n'
    (resof_name, resof_lname, @dummy, @dummy)
    SET resof_of_id = 1, 
    resof_paid = 250 + (500 - 250) * RAND();
    
LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\names.csv' INTO TABLE reservation_offers
	FIELDS TERMINATED BY '\t'
	LINES TERMINATED BY '\n'
    (resof_name, resof_lname, @dummy, @dummy)
    SET resof_of_id = 1, 
    resof_paid = 250 + (500 - 250) * RAND();
    
LOAD DATA INFILE 'C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\names.csv' INTO TABLE reservation_offers
	FIELDS TERMINATED BY '\t'
	LINES TERMINATED BY '\n'
    (resof_name, resof_lname, @dummy, @dummy)
    SET resof_of_id = 1, 
    resof_paid = 250 + (500 - 250) * RAND();
    

DROP PROCEDURE IF EXISTS new_driver;

DELIMITER $$

CREATE PROCEDURE new_driver(
IN drv_AT_param char(10),
    IN wrk_name_param varchar(20),
    IN wrk_lname_param varchar(20),
    IN wrk_salary_param float(7,2),
    IN drv_license_param enum('A','B','C','D'),
    IN drv_route_param enum('LOCAL','ABROAD'),
    IN drv_experience_param tinyint(4)
)

BEGIN
        DECLARE bid int(11);
       
SELECT br_code
        INTO bid
        FROM worker
JOIN branch ON wrk_br_code = br_code
JOIN driver ON wrk_AT = drv_AT
        GROUP BY br_code
        ORDER BY COUNT(drv_AT)
        LIMIT 1;
       
        SELECT bid;
        INSERT INTO worker VALUES(drv_AT_param, wrk_name_param, wrk_lname_param, wrk_salary_param, bid);
INSERT INTO driver VALUES(drv_AT_param, drv_license_param, drv_route_param, drv_experience_param);
END $$
DELIMITER ;


-- Για να μπορώ να τεστάρω το procedure
/*
SELECT *
FROM worker
JOIN branch ON wrk_br_code = br_code
JOIN driver ON wrk_AT = drv_AT;

CALL new_driver('AT12121212', 'Nikos', 'Gianeos', '800.00', 'A', 'LOCAL', 10);
*/
           
CREATE Index IX_reservation_offers_resof_paid
ON reservation_offers (resof_paid ASC);
       
DROP TRIGGER IF EXISTS changing_salary;
       
DELIMITER $$

CREATE TRIGGER changing_salary
BEFORE UPDATE ON worker
FOR EACH ROW
BEGIN
IF (NEW.wrk_salary < OLD.wrk_salary)
                THEN
SIGNAL SQLSTATE VALUE '45000'
                SET MESSAGE_TEXT = 'You cant set a lower salary';
                END IF;
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS branch_trip_details;
DELIMITER $$
CREATE PROCEDURE branch_trip_details(IN brid INT, IN fdate DATE, IN sdate DATE)
BEGIN
DECLARE branch_id INT;
    DECLARE first_date DATE;
    DECLARE sec_date DATE;
    SET branch_id = brid;
    SET first_date = fdate;
    SET sec_date = sdate;
   
    SELECT tr_id as trip_id, tr_cost as cost, tr_maxseats as maxseats, COUNT(reservation.res_tr_id) as reservations, tr_maxseats - COUNT(reservation.res_tr_id) as emptyseats, CONCAT(w1.wrk_lname, ' ', w1.wrk_name) as guide,  CONCAT(w2.wrk_lname, ' ', w2.wrk_name) as driver, DATE(tr_departure) as departure_date, DATE(tr_return) as return_date
    FROM trip JOIN worker as w1 ON w1.wrk_AT = tr_gui_AT JOIN worker as w2 ON w2.wrk_AT = tr_drv_AT JOIN reservation ON res_tr_id = tr_id
    WHERE tr_br_code = branch_id AND DATE(tr_departure) BETWEEN first_date AND sec_date
    GROUP BY tr_id;
   

END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS delete_worker;
DELIMITER $$
CREATE PROCEDURE delete_worker(IN workerid CHAR(10))
BEGIN
DECLARE worker_id CHAR(10);
    SET worker_id = workerid;
    IF EXISTS (SELECT * FROM manages WHERE mng_adm_AT = worker_id)
	THEN
		SELECT 'This worker is a branch manager and cannot be deleted.';
	ELSE
		DELETE FROM worker
		WHERE wrk_AT = worker_id;
	END IF;
   

END$$
DELIMITER ;


 /*
 DROP TRIGGER IF EXISTS actions;
DELIMITER $$
CREATE TRIGGER actions
AFTER INSERT, UPDATE
ON trip
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "INSERT", "trip");
END$$
DELIMITER ;
*/

DROP TRIGGER IF EXISTS trins;
DELIMITER $$
CREATE TRIGGER trins
AFTER INSERT
ON trip
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "INSERT", "trip");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS trup;
DELIMITER $$
CREATE TRIGGER trup
AFTER UPDATE
ON trip
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "UPDATE", "trip");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS trdel;
DELIMITER $$
CREATE TRIGGER trdel
AFTER DELETE
ON trip
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "DELETE", "trip");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS resins;
DELIMITER $$
CREATE TRIGGER resins
AFTER INSERT
ON reservation
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "INSERT", "reservation");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS resup;
DELIMITER $$
CREATE TRIGGER resup
AFTER UPDATE
ON reservation
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "UPDATE", "reservation");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS resdel;
DELIMITER $$
CREATE TRIGGER resdel
AFTER DELETE
ON reservation
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "DELETE", "reservation");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS ttins;
DELIMITER $$
CREATE TRIGGER ttins
AFTER INSERT
ON travel_to
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "INSERT", "travel_to");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS ttup;
DELIMITER $$
CREATE TRIGGER ttup
AFTER UPDATE
ON travel_to
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "UPDATE", "travel_to");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS ttdel;
DELIMITER $$
CREATE TRIGGER ttdel
AFTER DELETE
ON travel_to
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "DELETE", "travel_to");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS evins;
DELIMITER $$
CREATE TRIGGER evins
AFTER INSERT
ON event
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "INSERT", "event");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS evup;
DELIMITER $$
CREATE TRIGGER evup
AFTER UPDATE
ON event
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "UPDATE", "event");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS evdes;
DELIMITER $$
CREATE TRIGGER evdes
AFTER DELETE
ON event
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "DELETE", "event");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS desins;
DELIMITER $$
CREATE TRIGGER desins
AFTER INSERT
ON destination
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "INSERT", "destination");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS desup;
DELIMITER $$
CREATE TRIGGER desup
AFTER UPDATE
ON destination
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "UPDATE", "destination");
END$$
DELIMITER ;

DROP TRIGGER IF EXISTS desdel;
DELIMITER $$
CREATE TRIGGER desdel
AFTER DELETE
ON destination
FOR EACH ROW
BEGIN
INSERT INTO log VALUES(NULL, USER(), "DELETE", "destination");
END$$
DELIMITER ;


DROP TRIGGER IF EXISTS update_trip;
DELIMITER $$
CREATE TRIGGER update_trip
BEFORE UPDATE
ON trip
FOR EACH ROW
BEGIN
  IF (OLD.tr_departure <> NEW.tr_departure OR OLD.tr_return <> NEW.tr_return OR OLD.tr_cost <> NEW.tr_cost) AND
     (SELECT COUNT(*) FROM reservation WHERE res_tr_id = OLD.tr_id) > 0 THEN
    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT = 'Cannot update departure and arrival times or cost of trips with reservations';
  END IF;
END$$
DELIMITER ;



